package com.example.raphaelsantos.toplistsapp.ui.inject;

import com.example.raphaelsantos.toplistsapp.device.dagger.modules.AppModule;
import com.example.raphaelsantos.toplistsapp.device.dagger.modules.NetModule;
import com.example.raphaelsantos.toplistsapp.device.dagger.scopes.PerFragments;
import com.example.raphaelsantos.toplistsapp.ui.activities.HomeActivity;

import dagger.Component;

@PerFragments
@Component(modules = {AppModule.class, NetModule.class})
public interface TopListsComponent {

    void inject(HomeActivity homeActivity);
}
