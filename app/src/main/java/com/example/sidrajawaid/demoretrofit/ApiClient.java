package com.example.sidrajawaid.demoretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class ApiClient {
    public static final String KEY="AIzaSyB29icAJiwTCotW6Q-Vwn4VLbD2B9ZGppM";
    public static final String BASE_URL="https://www.googleapis.com/blogger/v3/blogs/2399953/";
    public static ApiClient apiClient;
    public static Retrofit retrofit;

    public static Retrofit getApiClient() {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
