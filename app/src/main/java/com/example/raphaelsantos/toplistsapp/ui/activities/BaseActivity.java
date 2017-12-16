package com.example.raphaelsantos.toplistsapp.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.raphaelsantos.toplistsapp.App;
import com.example.raphaelsantos.toplistsapp.ui.inject.TopListsComponent;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {
    protected Unbinder mBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        onBindView();
    }

    private void onBindView() {
        mBinder = ButterKnife.bind(this);
    }


    protected void startFragment(int fragmentID, Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment f = fm.findFragmentById(fragmentID);

        if (null == f) {
            fm.beginTransaction()
                    .add(fragmentID, fragment)
                    .commitAllowingStateLoss();
        } else {
            fm.beginTransaction()
                    .replace(fragmentID, fragment)
                    .commitAllowingStateLoss();
        }
    }

    protected abstract int getLayoutID();

    protected TopListsComponent getApplicationComponent() {
        return ((App) getApplication()).getTopListsComponent();
    }
}
