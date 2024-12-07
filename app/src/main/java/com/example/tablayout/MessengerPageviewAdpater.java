package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MessengerPageviewAdpater extends FragmentPagerAdapter {

    public MessengerPageviewAdpater(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       if(position==0)
       {
           return new FragmentA();
       } else if (position==1) {
           return new FragmentB();

       }
       else {
           return new FragmentC();
       }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Chats";
        } else if (position==1) {
            return "Status";

        }
        else {
            return "Calls";
        }
    }
}
