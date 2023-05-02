package com.example.memesapp;

import androidx.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MemesInstance {

    private static Retrofit retrofit = null;

   private static String BASE_URL = "https://meme-api.com/";

   //singleton pattern

    public static MemesInterface getervice(){
       if(retrofit ==null){
           retrofit = new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit.create(MemesInterface.class);
    }
}
