package com.example.praktekcustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie2451> {

    private Context mContext;
    private int mResource;

    public MovieAdapter(@NonNull Context context, int resource,  @NonNull ArrayList<Movie2451> objects) {
        super(context, resource,  objects);
        this.mContext = mContext;
        this.mResource = mResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String movieTitle = getItem(position).getTitle();
        String movieYear = getItem(position).getYear();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView txtTitle = convertView.findViewById(R.id.txtTitle);
        TextView txtYear  = convertView.findViewById(R.id.txtYear);

        txtTitle.setText(movieTitle);
        txtYear.setText(movieYear);

        return convertView;

    }
}




