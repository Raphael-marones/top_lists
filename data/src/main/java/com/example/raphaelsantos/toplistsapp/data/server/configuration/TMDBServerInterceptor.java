package com.example.raphaelsantos.toplistsapp.data.server.configuration;

import com.example.raphaelsantos.toplistsapp.data.BuildConfig;

import okhttp3.Request;

/**
 * Created by Tiago on 16/12/2017.
 */

public class TMDBServerInterceptor extends BaseServerInterceptor {

    private static final String TMDB_NAME = "themoviedb";

    @Override
    protected Request configureRequest(Request original, String hostName, Request.Builder builder) {
        Request newRequest = original;

        if (hostName.contains(TMDB_NAME)) {
            String newUrl = original.url().toString() + "&api_key=" + BuildConfig.TMDB_KEY;
            newRequest = builder.url(newUrl).build();
        }

        return newRequest;
    }
}
