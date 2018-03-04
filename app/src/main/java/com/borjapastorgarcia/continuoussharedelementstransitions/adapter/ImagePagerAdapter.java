package com.borjapastorgarcia.continuoussharedelementstransitions.adapter;

import static com.borjapastorgarcia.continuoussharedelementstransitions.adapter.ImageData.IMAGE_DRAWABLES;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.borjapastorgarcia.continuoussharedelementstransitions.fragment.ImageFragment;

/**
 * Created by borjapastorgarcia on 4/3/18.
 */

public class ImagePagerAdapter extends FragmentStatePagerAdapter {

    public ImagePagerAdapter(Fragment fragment) {
        // Note: Initialize with the child fragment manager.
        super(fragment.getChildFragmentManager());
    }

    @Override
    public int getCount() {
        return IMAGE_DRAWABLES.length;
    }

    @Override
    public Fragment getItem(int position) {
        return ImageFragment.newInstance(IMAGE_DRAWABLES[position]);
    }
}