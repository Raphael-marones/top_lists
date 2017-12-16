package com.example.raphaelsantos.toplistsapp.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raphaelsantos.toplistsapp.App;
import com.example.raphaelsantos.toplistsapp.ui.inject.TopListsComponent;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {

    protected Unbinder mBinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutID(), container, false);
        injectViews(view);

        return view;
    }

    private void injectViews(View view) {
        mBinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onDetach() {
        super.onDetach();

        if (mBinder != null)
            mBinder.unbind();

    }

    protected void startFragment(int fragmentID, Fragment fragment) {
        FragmentManager fm = getChildFragmentManager();
        android.support.v4.app.Fragment f = fm.findFragmentById(fragmentID);

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
        return ((App) getActivity().getApplication()).getTopListsComponent();
    }

}
