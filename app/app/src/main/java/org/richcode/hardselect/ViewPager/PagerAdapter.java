package org.richcode.hardselect.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.richcode.hardselect.Page.FragmentEdit;
import org.richcode.hardselect.Page.FragmentFeed;
import org.richcode.hardselect.Page.FragmentInfo;
import org.richcode.hardselect.Page.FragmentSearch;
import org.richcode.hardselect.Page.FragmentTop;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs){
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                FragmentFeed tab1 = new FragmentFeed();
                return tab1;
            case 1:
                FragmentEdit tab2 = new FragmentEdit();
                return tab2;
            case 2:
                FragmentTop tab4 = new FragmentTop();
                return tab4;
            case 3:
                FragmentInfo tab5 = new FragmentInfo();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
