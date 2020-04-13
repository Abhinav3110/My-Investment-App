package com.example.myinvestmentapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomArrayAdapter extends ArrayAdapter<String> {

    private final Activity appContext;
    private final String[] mainText;
    private final String[] subText;
    private final Integer[] imageId;

    public CustomArrayAdapter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, R.layout.custom_contact_view, R.id.mainTextView, maintitle);

        this.appContext = context;
        this.mainText = maintitle;
        this.subText = subtitle;
        this.imageId = imgid;

    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=appContext.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_contact_view, null,true);

        ImageView logoImageView = (ImageView) rowView.findViewById(R.id.logoImageView);
        TextView mainTextView = (TextView) rowView.findViewById(R.id.mainTextView);
        TextView subTextView = (TextView) rowView.findViewById(R.id.subTextView);

        logoImageView.setImageResource(imageId[position]);
        mainTextView.setText(mainText[position]);
        subTextView.setText(subText[position]);

        return rowView;
    }
}
