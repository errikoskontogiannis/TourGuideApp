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
public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("Bloomingdale's", getContext().getString(R.string.shops_bloomingdales_description), "1000 Third Avenue, 59th Street and Lexington Avenue, New York, NY 10022, United States", "+1 212-705-2000", "10AM–8:30PM", R.drawable.bloomingdales));
        listItems.add(new ListItem("Barneys", getContext().getString(R.string.shops_barneys_description), "660 Madison Ave, New York, NY 10065, USA", "+1 212-826-8900", "10AM–9PM", R.drawable.barneys));
        listItems.add(new ListItem("Century 21", getContext().getString(R.string.shops_century21_description), "22 Cortlandt St, New York, NY 10007, USA", "+1 212-227-9092", "7:45AM–9:30PM", R.drawable.century21));
        listItems.add(new ListItem("Apple Store SoHo", getContext().getString(R.string.shops_apple_store_description), "103 Prince St, New York, NY 10012, USA", "+1 212-226-3126", "9AM–9PM", R.drawable.apple_store));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
