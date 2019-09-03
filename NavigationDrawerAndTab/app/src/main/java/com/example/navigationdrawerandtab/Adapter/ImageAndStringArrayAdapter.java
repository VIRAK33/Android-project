package com.example.navigationdrawerandtab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.navigationdrawerandtab.R;

import java.util.List;

public class ImageAndStringArrayAdapter extends ArrayAdapter<ImageAndString> {
    public ImageAndStringArrayAdapter(Context context, int resource, List<ImageAndString> objects) {
        super(context, resource, objects);
    }


    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { //position is inded in array
        //TODO check convertView if not null (cached)
        //Convet xml to java
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item,parent,false);

        //TODO fill data here
        ImageAndString item = getItem(position);
        ImageView iv = convertView.findViewById(R.id.image);
        iv.setImageResource(item.getImagees());
        TextView tv = convertView.findViewById(R.id.text);
        tv.setText(item.getName());

        return convertView;
    }
}