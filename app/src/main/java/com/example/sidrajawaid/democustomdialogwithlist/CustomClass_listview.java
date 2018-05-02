package com.example.sidrajawaid.democustomdialogwithlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CustomClass_listview extends ArrayAdapter<String> {
    Context context;
    String[] mstring;

    public CustomClass_listview(@NonNull Context context, String[] string_array) {
        super(context, R.layout.alertdialog_list,string_array);
        this.context=context;
        this.mstring=string_array;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
return convertView;
    }
}
