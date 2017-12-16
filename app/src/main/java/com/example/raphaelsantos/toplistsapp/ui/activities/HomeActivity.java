package com.example.raphaelsantos.toplistsapp.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.raphaelsantos.toplistsapp.R;

public class HomeActivity extends BaseActivity {

    /*

    Exemplo de Uso do Inject:

    @Inject
    Retrofit mRetrofit;
    */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inject View
        getApplicationComponent().inject(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_home;
    }
}
