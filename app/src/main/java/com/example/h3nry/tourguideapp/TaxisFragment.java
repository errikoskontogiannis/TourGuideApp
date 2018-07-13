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
public class TaxisFragment extends Fragment {

    public TaxisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("OnCabs New York", getContext().getString(R.string.taxis_oncabs_description), "New York, NY, USA", "+1 646-248-5860", "24/7", R.drawable.oncabs));
        listItems.add(new ListItem("Dial 7 - NYC Car and Limo Services", getContext().getString(R.string.taxis_dial_7_cabs_description), "43-23 35th St, Long Island City, NY 11101, USA", "+1 800-777-8888", "24/7", R.drawable.dial_7_cabs));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
