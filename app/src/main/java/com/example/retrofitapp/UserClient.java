package com.example.retrofitapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserClient {
//http://dummy.restapiexample.com/create
    @POST("create")
    Call<Response> createUser(@Body User user);
}
