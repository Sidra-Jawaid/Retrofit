package com.example.sidrajawaid.demoretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("?key="+ApiClient.KEY)
    Call<Example> getExample();


   /* @GET("[postId]/?key="+ApiClient.KEY)
    Call<Locale> getLocale(@Path("postId") String locale);*/
}
