package com.example.raphaelsantos.toplistsapp.data.server.configuration;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public abstract class BaseServerInterceptor implements Interceptor {
    protected static final int RETRY = 3;

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        String hostName = original.url().host();
        Request.Builder builder = original.newBuilder();

        Request newRequest = configureRequest(original, hostName, builder);
        Response response = chain.proceed(newRequest);

        int retryCount = 0;
        while (!response.isSuccessful() && retryCount < RETRY) {
            retryCount++;
            response = chain.proceed(newRequest);
        }

        return response;
    }

    protected abstract Request configureRequest(Request original, String hostName, Request.Builder builder);
}
