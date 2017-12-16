package com.example.raphaelsantos.toplistsapp.device.dagger.modules;

import android.app.Application;

import com.example.raphaelsantos.toplistsapp.data.server.configuration.TMDBServerInterceptor;
import com.example.raphaelsantos.toplistsapp.device.BuildConfig;
import com.example.raphaelsantos.toplistsapp.device.dagger.scopes.PerFragments;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Module
public class NetModule {

    @Provides
    Cache provideOkHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    @Provides
    OkHttpClient provideOkHttpClient(TMDBServerInterceptor tmdbServerInterceptor) {
        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(tmdbServerInterceptor)
                .build();

        return okClient;
    }

    @PerFragments
    @Provides
    TMDBServerInterceptor providesTMDBServerInterceptor() {
        return new TMDBServerInterceptor();
    }

    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient, RxJava2CallAdapterFactory rxJava2CallAdapterFactory) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(rxJava2CallAdapterFactory)
                .baseUrl(BuildConfig.TMDB_BASE_URL)
                .client(okHttpClient)
                .build();

        return retrofit;
    }
    @Provides
    RxJava2CallAdapterFactory provideRxJava2CallAdapterFactory() {
        return RxJava2CallAdapterFactory.create();
    }
}
