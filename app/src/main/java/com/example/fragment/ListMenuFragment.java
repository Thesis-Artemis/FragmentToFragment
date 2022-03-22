package com.example.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListMenuFragment extends ListFragment {
    String[] users = new String[] { "Huong","Mai","Hoan","Truong","Phuc","Quang" };
    String[] location = new String[]{"Dong Nai","Binh Duong","LOng Xuyen","TP.HCM","Binh Thuan","Ha Noi"};
    String[] age=new String[]{"22","22","22","22","22","22"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.list_item, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("Name: "+ users[position],"Location : "+ location[position],"Age : "+ age[position]);
        getListView().setSelector(android.R.color.holo_purple);
    }
}