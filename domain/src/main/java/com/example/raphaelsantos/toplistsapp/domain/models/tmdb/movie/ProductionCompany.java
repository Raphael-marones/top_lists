package com.example.raphaelsantos.toplistsapp.domain.models.tmdb.movie;


import android.os.Parcel;
import android.os.Parcelable;

import com.example.raphaelsantos.toplistsapp.domain.models.tmdb.IDNameAbstract;

public class ProductionCompany extends IDNameAbstract implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public ProductionCompany() {
    }

    protected ProductionCompany(Parcel in) {
    }

    public static final Parcelable.Creator<ProductionCompany> CREATOR = new Parcelable.Creator<ProductionCompany>() {
        @Override
        public ProductionCompany createFromParcel(Parcel source) {
            return new ProductionCompany(source);
        }

        @Override
        public ProductionCompany[] newArray(int size) {
            return new ProductionCompany[size];
        }
    };
}
