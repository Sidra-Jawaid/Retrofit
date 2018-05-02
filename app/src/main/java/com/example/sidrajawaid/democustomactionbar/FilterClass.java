package com.example.sidrajawaid.democustomactionbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.widget.Filter;

import java.util.ArrayList;

public class FilterClass extends Filter {
    AdapterClass adapter_Class;
    final ArrayList<ModelClass> filterlist;


    public FilterClass(AdapterClass adapter_Class, ArrayList<ModelClass> filteredarray) {
        this.adapter_Class = adapter_Class;
        this.filterlist = filteredarray;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {

        FilterResults filterResults=new FilterResults();

        if(constraint!=null&&constraint.length()>0) {
            ArrayList<ModelClass> filteredfruitlist = new ArrayList<>();
            constraint = constraint.toString().toUpperCase();
            for (ModelClass m : filterlist) {
                if (m.getText().toUpperCase().contains(constraint)) {
                    filteredfruitlist.add(m);
                }
            }
            filterResults.count = filteredfruitlist.size();
            filterResults.values = filteredfruitlist;
            return filterResults;
        }
        else {
            filterResults.count = filterlist.size();
            filterResults.values = filterlist;
            return filterResults;
        }
    }
    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter_Class.arrayList=(ArrayList<ModelClass>)results.values;
        adapter_Class.notifyDataSetChanged();
    }
}
