package com.example.h3nry.tourguideapp;

public class ListItem {

    private String mListItemName;

    private String mListItemDescription;

    private String mListItemLocation;

    private String mListItemPhone;

    private String mListItemHours;

    private int mImageResourceId;

    public ListItem(String listItemName, String listItemDescription, String listItemLocation, String listItemPhone, String listItemHours, int imageResourceId) {

        mListItemName = listItemName;

        mListItemDescription = listItemDescription;

        mListItemLocation = listItemLocation;

        mListItemPhone = listItemPhone;

        mListItemHours = listItemHours;

        mImageResourceId = imageResourceId;

    }

    public String getListItemName() {

        return mListItemName;

    }

    public String getListItemDescription() {

        return mListItemDescription;

    }

    public String getListItemLocation() {

        return mListItemLocation;

    }

    public String getListItemPhone() {

        return mListItemPhone;

    }

    public String getListItemHours() {

        return mListItemHours;

    }

    public int getImageResourceId() {

        return mImageResourceId;

    }

}
