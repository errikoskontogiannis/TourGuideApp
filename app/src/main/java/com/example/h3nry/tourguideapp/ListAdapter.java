package com.example.h3nry.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class ListAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ListAdapter(Context context, FragmentManager fm) {

        super(fm);

        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return new SightsFragment();

        } else if (position == 1){

            return new RestaurantsFragment();

        } else if (position == 2){

            return new ShopsFragment();

        } else {

            return new TaxisFragment();

        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {

            return mContext.getString(R.string.category_sights);

        } else if (position == 1) {

            return mContext.getString(R.string.category_restaurants);

        } else if (position == 2) {

            return mContext.getString(R.string.category_shops);

        } else {

            return mContext.getString(R.string.category_taxis);

        }

    }

}
