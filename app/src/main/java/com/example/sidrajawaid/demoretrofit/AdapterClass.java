package com.example.sidrajawaid.demoretrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {
Context context;
List<Example> array_List;



    public AdapterClass(List<Example> list) {
        this.array_List = list;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Example example= array_List.get(position);
        holder.tv1.setText(example.getKind());
        holder.tv2.setText(example.getId());
        holder.tv3.setText(example.getName());
        holder.tv4.setText(example.getDescription());
        holder.tv5.setText(example.getPublished());
        holder.tv6.setText(example.getUpdated());
        holder.tv7.setText(example.getUrl());
        holder.tv8.setText(example.getSelfLink());

        holder.tv9.setText(example.getPages().getTotalItems()+" ");
        holder.tv10.setText(example.getPages().getSelfLink());

        holder.tv11.setText(example.getPosts().getTotalItems()+" ");
        holder.tv12.setText(example.getPosts().getSelfLink());

        holder.tv13.setText(example.getLocale().getLanguage());
        holder.tv14.setText(example.getLocale().getCountry());
        holder.tv15.setText(example.getLocale().getVariant());




    }

public void setList(List<Example> list){
        this.array_List=  list;
        notifyDataSetChanged();

}
    @Override
    public int getItemCount() {
        return array_List != null ? array_List.size():0;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        TextView tv5;
        TextView tv6;
        TextView tv7;
        TextView tv8;
        TextView tv9;
        TextView tv10;
        TextView tv11;
        TextView tv12;
        TextView tv13;
        TextView tv14;
        TextView tv15;

        public MyViewHolder (View itemView) {
            super(itemView);
            tv1 =  itemView.findViewById(R.id.textView2);
            tv2 = itemView.findViewById(R.id.textView4);
            tv3 =  itemView.findViewById(R.id.textView6);
            tv4 = itemView.findViewById(R.id.textView8);
            tv5 = itemView.findViewById(R.id.textView10);
            tv6 =  itemView.findViewById(R.id.textView12);
            tv7 =  itemView.findViewById(R.id.textView14);
            tv8 =  itemView.findViewById(R.id.textView16);
            tv9 =  itemView.findViewById(R.id.textView18);
            tv10 = itemView.findViewById(R.id.textView20);
            tv11 =  itemView.findViewById(R.id.textView22);
            tv12 = itemView.findViewById(R.id.textView24);
            tv13 = itemView.findViewById(R.id.textView26);
            tv14 =  itemView.findViewById(R.id.textView28);
            tv15 =  itemView.findViewById(R.id.textView30);

        }
    }
}
