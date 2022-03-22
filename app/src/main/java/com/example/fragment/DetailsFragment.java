package com.example.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tutlane on 06-08-2017.
 */

public class DetailsFragment extends Fragment {
    TextView name,location,age;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        name = (TextView)view.findViewById(R.id.Name);
        location = (TextView)view.findViewById(R.id.Location);
        age = (TextView)view.findViewById(R.id.Age);
        return view;
    }
    public void change(String uname, String ulocation,String uage){
        name.setText(uname);
        location.setText(ulocation);
        age.setText(uage);
    }
}
