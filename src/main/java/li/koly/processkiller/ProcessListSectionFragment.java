package li.koly.processkiller;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* Created by tw on 5/28/13.
*/
class ProcessListSectionFragment extends Fragment {
    public static final String ARG_SECTION_NUMBER = "section_number";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ActivityManager activityManager = (ActivityManager)getActivity().getSystemService(Context.ACTIVITY_SERVICE);
        View rootView = inflater.inflate(R.layout.fragment_section_dummy, container, false);
        ListView processListView = (ListView) rootView.findViewById(R.id.process_list_view);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        ArrayList<HashMap<String, Object>> processList = Lists.newArrayList();
        int number=0;
        for (ActivityManager.RunningAppProcessInfo appInfo : runningAppProcesses) {
            HashMap<String, Object> appInfoMap = Maps.newHashMap();
            appInfoMap.put("number", number);
            appInfoMap.put("name", appInfo.processName);
            processList.add(appInfoMap);
            number+=1;
        }

        SimpleAdapter listItemAdapter = new SimpleAdapter(this.getActivity(),
                processList, R.layout.process_list_layout,
                new String[]{"number","name"},
                new int[]{R.id.process_item_number,R.id.process_item_name});

        processListView.setAdapter(listItemAdapter);
        return rootView;
    }
}
