package com.example.sidrajawaid.democustomactionbar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment3 extends Fragment {

    public fragment3() {
        // Required empty public constructor
    }

    public static fragment3 newInstance(String param1, String param2) {
        fragment3 fragment = new fragment3();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment3, container, false);
        return v;
    }
}
