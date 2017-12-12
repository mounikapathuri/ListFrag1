package com.android.mounika.listfrag1;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ListFrag extends Fragment {
    private OnItemSelectedListener listener;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_list, container, false);
        Button button = (Button) view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateDetail("Layout1");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateDetail("layout2");
            }
        });
        return view;
    }
    public interface OnItemSelectedListener {
        public void onRssItemSelected(String link);
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof OnItemSelectedListener) {
            listener = (OnItemSelectedListener) activity;
        } else {
            throw new ClassCastException(activity.toString() + " must implemenet MyListFragment.OnItemSelectedListener");
        }
    }
    public void updateDetail(String s) {
        listener.onRssItemSelected(s);
    }
    @Override
    public void onDetach() {
        super.onDetach();

    }
}

