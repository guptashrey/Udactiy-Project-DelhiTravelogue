package net.shreygupta.delhitravelogue;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {

    public DataAdapter(Context context, ArrayList<Data> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Data currentData = getItem(position);

        ImageView photoImageView = listItemView.findViewById(R.id.photoImageView);
        if (currentData.hasImage()) {
            photoImageView.setImageResource(currentData.getImageResourceId());
            photoImageView.setVisibility(View.VISIBLE);
        } else {
            photoImageView.setVisibility(View.GONE);
        }

        TextView nameTextView = listItemView.findViewById(R.id.nameTextView);
        nameTextView.setText(currentData.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(currentData.getDescription());

        TextView addressTextView = listItemView.findViewById(R.id.addressTextView);
        if (currentData.hasAddress()) {
            addressTextView.setText(currentData.getAddress());
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            addressTextView.setVisibility(View.GONE);
        }

        TextView timingTextView = listItemView.findViewById(R.id.timingTextView);
        if (currentData.hasTiming()) {
            timingTextView.setText(currentData.getTiming());
            timingTextView.setVisibility(View.VISIBLE);
        } else {
            timingTextView.setVisibility(View.GONE);
        }

        TextView priceTextView = listItemView.findViewById(R.id.priceTextView);
        if (currentData.hasPrice()) {
            priceTextView.setText(currentData.getPrice());
            priceTextView.setVisibility(View.VISIBLE);
        } else {
            priceTextView.setVisibility(View.GONE);
        }

        TextView contactTextView = listItemView.findViewById(R.id.contactTextView);
        if (currentData.hasContact()) {
            contactTextView.setText(currentData.getContact());
            contactTextView.setVisibility(View.VISIBLE);
        } else {
            contactTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}