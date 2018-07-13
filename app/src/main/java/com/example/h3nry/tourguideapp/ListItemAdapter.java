package com.example.h3nry.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemAdapter<W> extends ArrayAdapter<ListItem> {

    // Creating Custom Constructor
    private static final String LOG_TAG = ListItemAdapter.class.getSimpleName();

    public ListItemAdapter(Activity context, int list_item, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Recycling Mechanism
        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        // Current Item Position
        ListItem currentListItem = getItem(position);

        // Get ListItem Name
        TextView listItemName = (TextView) listItemView.findViewById(R.id.listitem_name_text_view);
        listItemName.setText(currentListItem.getListItemName());

        // Get ListItem Description
        TextView listItemDescription = (TextView) listItemView.findViewById(R.id.listitem_description_text_view);
        listItemDescription.setText(currentListItem.getListItemDescription());

        // Get ListItem Location
        TextView listItemLocation = (TextView) listItemView.findViewById(R.id.listitem_location_text_view);
        listItemLocation.setText(currentListItem.getListItemLocation());

        // Get ListItem Phone
        TextView listItemPhone = (TextView) listItemView.findViewById(R.id.listitem_phone_text_view);
        listItemPhone.setText(currentListItem.getListItemPhone());

        // Get ListItem Hours
        TextView listItemHours = (TextView) listItemView.findViewById(R.id.listitem_hours_text_view);
        listItemHours.setText(currentListItem.getListItemHours());

        // Get ListItem Image
        ImageView listItemImageView = (ImageView) listItemView.findViewById(R.id.listitem_image);
        listItemImageView.setImageResource(currentListItem.getImageResourceId());

        return listItemView;

    }
}
