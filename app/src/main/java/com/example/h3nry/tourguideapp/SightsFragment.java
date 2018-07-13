package com.example.h3nry.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("Statue of Liberty", getContext().getString(R.string.sights_statue_of_liberty_description), "New York, NY 10004, USA", "+1 212-363-3200", "8:30AM–4PM", R.drawable.statue_of_liberty));
        listItems.add(new ListItem("Central Park", getContext().getString(R.string.sights_central_park_description), "New York, NY, USA", "+1 212-310-6600", "6AM–1AM", R.drawable.central_park));
        listItems.add(new ListItem("Empire State Building", getContext().getString(R.string.sights_empire_state_building_description), "350 5th Ave, New York, NY 10118, USA", "+1 212-736-3100", "8AM–2AM", R.drawable.empire_state_building));
        listItems.add(new ListItem("Times Square", getContext().getString(R.string.sights_times_square_description), "Manhattan, NY 10036, USA", "+1 690-847-0982", "9AM–8PM", R.drawable.times_square));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
