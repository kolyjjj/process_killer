package li.koly.processkiller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
* Created by tw on 5/28/13.
*/
class AppSectionsPagerAdapter extends FragmentPagerAdapter {
    public AppSectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new KillFragment();
            default:
                Fragment fragment = new DummySectionFragment();
                Bundle args = new Bundle();
                args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
                fragment.setArguments(args);
                return fragment;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Section" + (position + 1);
    }
}
