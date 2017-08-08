package net.shreygupta.delhitravelogue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static java.sql.Types.NULL;

public class AboutFragment extends Fragment {

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);
        ArrayList<Data> contents = new ArrayList<Data>();

        String[] name = getResources().getStringArray(R.array.about);
        String[] desc = getResources().getStringArray(R.array.about_desc);

        for (int i = 0; i < desc.length; i++) {
            contents.add(new Data(NULL, name[i], desc[i], null, null, null, null));
        }

        DataAdapter adptr = new DataAdapter(getActivity(), contents);
        ListView list = rootView.findViewById(R.id.listView);
        list.setAdapter(adptr);

        return rootView;
    }
}