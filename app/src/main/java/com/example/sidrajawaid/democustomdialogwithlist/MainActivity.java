package com.example.sidrajawaid.democustomdialogwithlist;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn);
        /*ArrayList<String> list_for_alert=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        list_for_alert.add("Discout1");
        list_for_alert.add("Discout2");
        list_for_alert.add("Discout3");
        list_for_alert.add("Discout4");
        list_for_alert.add("Discout5");
        list_for_alert.add("Discout6");
        list_for_alert.add("Discout7");
        list_for_alert.add("Discout8");
        list_for_alert.add("Discout9");
        list_for_alert.add("Discout10");
        list_for_alert.add("Discout11");
        list_for_alert.add("Discout12");
        list_for_alert.add("Discout13");
        list_for_alert.add("Discout14");
        list_for_alert.add("Discout15");*/
        //ListView listView=findViewById(R.id.));
        //listView.setAdapter(l);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
                final String[] arraylist={"discount 1","discount 2","discount3","discount 1","discount 2","discount3","discount 1","discount 2","discount3","discount 1","discount 2","discount3"};
                        ab.setTitle("Sample View Pager")
                        .setItems(arraylist, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Toast.makeText(getApplicationContext(),"You clicked "+arraylist[which],Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setIcon(R.drawable.alerticon)
                        .setCancelable(true).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Toast generated",Toast.LENGTH_SHORT).show();
                            }
                        });
                        ab.create().show();
            }
        });
    }
}
