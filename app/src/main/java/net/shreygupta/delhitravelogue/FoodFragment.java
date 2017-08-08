package net.shreygupta.delhitravelogue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);
        ArrayList<Data> contents = new ArrayList<Data>();

        int[] img = new int[]{R.drawable.big_yellow_door, R.drawable.pizza_hut, R.drawable.burger_king, R.drawable.barbeque_nation, R.drawable.khan_chacha};
        String[] name = getResources().getStringArray(R.array.food_outlet_name);
        String[] desc = getResources().getStringArray(R.array.food_outlet_desc);
        String[] address = getResources().getStringArray(R.array.food_outlet_address);
        String[] timing = getResources().getStringArray(R.array.food_outlet_timing);
        String[] price = getResources().getStringArray(R.array.food_outlet_price);
        String[] contact = getResources().getStringArray(R.array.food_outlet_contact);

        for (int i = 0; i < desc.length; i++) {
            contents.add(new Data(img[i], name[i], desc[i], address[i], timing[i], price[i], contact[i]));
        }

        DataAdapter adptr = new DataAdapter(getActivity(), contents);
        ListView list = rootView.findViewById(R.id.listView);
        list.setAdapter(adptr);

        return rootView;
    }
}