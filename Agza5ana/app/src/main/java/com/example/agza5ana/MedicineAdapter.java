package com.example.agza5ana;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MedicineAdapter extends ArrayAdapter<Medicine> {
    public MedicineAdapter(Context context, int resource, List<Medicine> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.medicine_list,parent,false);

        TextView medicine_name =convertView.findViewById(R.id.med_name);
        TextView medicine_price =convertView.findViewById(R.id.med_price);
        ImageView medicine_image =convertView.findViewById(R.id.med_image);
        ConstraintLayout view =convertView.findViewById(R.id.med_list);

        medicine_name.setText(getItem(position).getName());
        medicine_price.setText((int) getItem(position).getPrice());
        medicine_image.setImageResource(getItem(position).getImage());

        return convertView;
    }
}

