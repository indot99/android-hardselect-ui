package org.richcode.hardselect;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.richcode.hardselect.ViewPager.NonSwipeViewPager;
import org.richcode.hardselect.ViewPager.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    NonSwipeViewPager viewPager;
    TabLayout tabLayout;

//    TabLayout.Tab feed = new TabLayout.Tab();
//    TabLayout.Tab board = new TabLayout.Tab();
//    TabLayout.Tab search = new TabLayout.Tab();
//    TabLayout.Tab top = new TabLayout.Tab();
//    TabLayout.Tab info = new TabLayout.Tab();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (NonSwipeViewPager)findViewById(R.id.pager);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("피드"));
        tabLayout.addTab(tabLayout.newTab().setText("작성"));
        tabLayout.addTab(tabLayout.newTab().setText("베스트"));
        tabLayout.addTab(tabLayout.newTab().setText("내정보"));
        tabLayout.getTabAt(0).setIcon(R.drawable.selector_feedtab);
        tabLayout.getTabAt(1).setIcon(R.drawable.selector_edittab);
        tabLayout.getTabAt(2).setIcon(R.drawable.selector_crowntab);
        tabLayout.getTabAt(3).setIcon(R.drawable.selector_infotab);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
