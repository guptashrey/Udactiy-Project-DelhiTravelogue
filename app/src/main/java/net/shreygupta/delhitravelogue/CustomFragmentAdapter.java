package net.shreygupta.delhitravelogue;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomFragmentAdapter extends FragmentPagerAdapter {

    public CustomFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new ExploreFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "About";
        } else if (position == 1) {
            return "Explore";
        } else if (position == 2) {
            return "Food";
        } else {
            return "Shopping";
        }
    }
}