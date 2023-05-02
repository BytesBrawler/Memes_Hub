package com.example.memesapp;

import com.example.memesapp.model.MemesModel;

import kotlin.text.UStringsKt;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MemesInterface {
// public String s = "IndianDankMemes";
// public String u = "news";
// public String t = "dankmemes";
    @GET("gimme/famfriendlymemes")
    Call<MemesModel> getMemes();
}
