package com.example.sidrajawaid.demoretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    AdapterClass adapterClass;
    RecyclerView.LayoutManager layoutManager;
   List <Example> list = new ArrayList<>();
    RecyclerView recyclerView;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapterClass = new AdapterClass(list);
        recyclerView.setAdapter(adapterClass);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        getData();

    }
    public void getData()
    {
        Call<Example> example = apiInterface.getExample();
        example.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                list.add(response.body());
                ((AdapterClass)recyclerView.getAdapter()).setList( list);
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error Occured", Toast.LENGTH_SHORT).show();
            }
        });
           }
}
