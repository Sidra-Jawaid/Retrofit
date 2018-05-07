package com.example.sidrajawaid.democustomactionbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.myViewHolder> implements Filterable {
    ArrayList<ModelClass> arrayList;
    Context context;
    ArrayList<ModelClass> filteredfruitlist;
    FilterClass filterrclass;

    public AdapterClass(Context context,ArrayList<ModelClass> array_List)
    {
        this.context=context;
        this.arrayList=array_List;
        this.filteredfruitlist=array_List;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        ModelClass model_class=arrayList.get(position);
        holder.image.setImageResource(model_class.getImage());
        holder.txt.setText(model_class.getText());
    }

    @Override
    public int getItemCount() {
       return arrayList != null ? arrayList.size():0;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView txt;
        public myViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            txt=itemView.findViewById(R.id.text);
        }
    }
    public Filter getFilter() {
        if(filterrclass==null)
        {
            filterrclass=new FilterClass(AdapterClass.this,filteredfruitlist);

        }
        return filterrclass;
    }
}
