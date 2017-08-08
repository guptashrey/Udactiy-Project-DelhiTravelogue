package net.shreygupta.delhitravelogue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);
        ArrayList<Data> contents = new ArrayList<Data>();

        int[] img = new int[]{R.drawable.lifestyle, R.drawable.forever21, R.drawable.levis, R.drawable.pantaloons};
        String[] name = getResources().getStringArray(R.array.shop_name);
        String[] desc = getResources().getStringArray(R.array.shop_desc);
        String[] address = getResources().getStringArray(R.array.shop_address);
        String[] timing = getResources().getStringArray(R.array.shop_timing);
        String[] contact = getResources().getStringArray(R.array.shop_contact);

        for (int i = 0; i < desc.length; i++) {
            contents.add(new Data(img[i], name[i], desc[i], address[i], timing[i], null, contact[i]));
        }

        DataAdapter adptr = new DataAdapter(getActivity(), contents);
        ListView list = rootView.findViewById(R.id.listView);
        list.setAdapter(adptr);

        return rootView;
    }
}