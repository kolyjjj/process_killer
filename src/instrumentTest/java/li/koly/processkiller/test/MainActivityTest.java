package li.koly.processkiller.test;

import android.content.Intent;
import li.koly.processkiller.MainActivity;
import li.koly.processkiller.R;

public class MainActivityTest extends android.test.ActivityUnitTestCase<MainActivity>{

    private MainActivity activity;

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                MainActivity.class);
        startActivity(intent, null, null);
        activity = getActivity();
    }

    public void testKillButtonShouldBeHere(){
        assertNotNull(activity.findViewById(R.id.kill_button));
    }

    public void testFailedTest(){
        //assertEquals(false, true);
    }

}
