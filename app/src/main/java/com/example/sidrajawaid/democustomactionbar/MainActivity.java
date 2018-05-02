package com.example.sidrajawaid.democustomactionbar;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
Spinner spinner;
    FragmentTransaction ft;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitleMargin(10,0,0,0);
        toolbar.setLogo(R.drawable.toolbaricon);
        toolbar.setTitle(" Action Bar");
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menucontent,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId())
            {
                case R.id.one:
                    Toast.makeText(MainActivity.this,"Menu Item 1",Toast.LENGTH_SHORT).show();
                    fragment1 frag1=new fragment1();
                    fm=getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.addToBackStack(null);
                    ft.replace(R.id.frame,frag1);
                    ft.commit();

                    break;
                case R.id.two:
                    Toast.makeText(MainActivity.this,"Menu Item 2",Toast.LENGTH_SHORT).show();
                    fragment2 frag2=new fragment2();
                    fm=getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame,frag2);
                    ft.addToBackStack(null);
                    ft.attach(frag2).commit();

                    break;
                case R.id.three:
                    Toast.makeText(MainActivity.this,"Menu Item 3",Toast.LENGTH_SHORT).show();
                    fragment3 frag3=new fragment3();
                    fm=getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame,frag3);
                    ft.attach(frag3).commit();
                    break;
            }
        return true;
    }



}
