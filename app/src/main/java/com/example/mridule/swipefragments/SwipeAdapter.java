package com.example.mridule.swipefragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mridule on 30/12/19.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }
    @Nullable
    @Override
    public Fragment getItem(int position)
    {   Fragment frag=null;
        switch(position)
        {
            case 0:
                frag= new fragment1();
                break;
            case 1:
                frag= new fragment2();
                break;
            case 2:
                frag= new fragment3();
                break;
        }
//        Bundle bundle=new Bundle();
//        bundle.putInt("pageNumber",position+1);
//        pageFragment.setArguments(bundle);
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
