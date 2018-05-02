package com.example.sidrajawaid.democustomactionbar;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment1 extends Fragment {
    Spinner spinner;
    Toolbar toolbar;
    ImageView imageview;
    EditText edtext;

    ArrayList<ModelClass> arrayList=new ArrayList<>();
    AdapterClass adapterClass;
    RecyclerView recyclerView;
    SearchView searchview;


    public fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragment1, container, false);
        recyclerView=v.findViewById(R.id.rv);
        toolbar= v.findViewById(R.id.toolbar);
        searchview=v.findViewById(R.id.search);
        /*imageview=v.findViewById(R.id.image);
        edtext=v.findViewById(R.id.ed);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtext.setVisibility(View.VISIBLE);
            }
        });
        String[] toolbarspinner={"windows","ios","android"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,toolbarspinner);
        spinner=v.findViewById(R.id.spinner);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(arrayAdapter);*/
        recyclerView=v.findViewById(R.id.rv);
        arrayList=new ArrayList<>();
        arrayList.add(new ModelClass(R.drawable.grapes,"Grapes"));
        arrayList.add(new ModelClass(R.drawable.cherry,"Cherry"));
        arrayList.add(new ModelClass(R.drawable.pineapple,"Pineapple"));
        arrayList.add(new ModelClass(R.drawable.orange,"Orange"));
        arrayList.add(new ModelClass(R.drawable.avocado,"Avocado"));
        arrayList.add(new ModelClass(R.drawable.lechee,"Lechee"));
        arrayList.add(new ModelClass(R.drawable.watermelon,"Watewrmelon"));
        arrayList.add(new ModelClass(R.drawable.banana,"Banana"));
        arrayList.add(new ModelClass(R.drawable.mango,"Mango"));
        arrayList.add(new ModelClass(R.drawable.pomegranate,"Pomegranate"));
        arrayList.add(new ModelClass(R.drawable.kiwi,"Kiwi"));
        adapterClass=new AdapterClass(getContext(),arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapterClass);
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapterClass.getFilter().filter(newText);
                return false;
            }
        });
        return v;
    }


}
