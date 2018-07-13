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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("Jing Fong", getContext().getString(R.string.restaurants_jing_fong_description), "20 Elizabeth St, New York, NY 10013, USA", "+1 212-964-5256", "10AM-9:30PM", R.drawable.jing_fong));
        listItems.add(new ListItem("Katz Delicatessen", getContext().getString(R.string.restaurants_katz_deli_description), "205 E Houston St, New York, NY 10002, USA", "+1 212-254-2246", "8AM–12AM", R.drawable.katz_deli));
        listItems.add(new ListItem("Wildair", getContext().getString(R.string.restaurants_wildair_description), "142 Orchard St, New York, NY 10002, USA", "+1 646-964-5624", "6PM-11PM", R.drawable.wildair));
        listItems.add(new ListItem("Balthazar", getContext().getString(R.string.restaurants_balthazar_description), "80 Spring St, New York, NY 10012, USA", "+1 212-965-1414", "12PM–1AM", R.drawable.balthazar));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
