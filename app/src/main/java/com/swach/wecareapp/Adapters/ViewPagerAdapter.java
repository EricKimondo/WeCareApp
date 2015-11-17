package com.swach.wecareapp.Adapters;




import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.swach.wecareapp.fragments.AdminFragment;
import com.swach.wecareapp.fragments.SponsorFragment;
import com.swach.wecareapp.fragments.UserFragment;


/**
 * Created by BARBE GAMBINO on 10/27/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence Title[];
    int NumberOfTabs;

    public ViewPagerAdapter(FragmentManager fm, CharSequence title[], int number) {
        super(fm);
        this.Title = title;
        this.NumberOfTabs = number;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                //show the Admin fragment
                UserFragment tab1 = new UserFragment();
                return tab1;
            case 1:
                //show the education fragment
               AdminFragment tab2 = new AdminFragment();
                return tab2;
            case 2:
                //show the employment fragment
                SponsorFragment tab3 = new SponsorFragment();
                return tab3;

        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Title[position];
    }

    //this method returns the number of tabs in the tab strip
    @Override
    public int getCount() {
        return Title.length;
    }
}
