package com.example.raphaelsantos.toplistsapp.domain.models.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by raphaelsantos on 12/22/17.
 */

public class Series implements Parcelable {

    private String name;

    private String mainDirector;

    private String dateRelease;

    private int numberSeasons;

    private String horizontalImageUrl;

    private String verticalImageUrl;

    private Boolean isFavorited = false;

    private Boolean isFinished = true;

    private Boolean wasCanceled = true;

    private Boolean isAddedToWishlist = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainDirector() {
        return mainDirector;
    }

    public void setMainDirector(String mainDirector) {
        this.mainDirector = mainDirector;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    public int getNumberSeasons() {
        return numberSeasons;
    }

    public void setNumberSeasons(int numberSeasons) {
        this.numberSeasons = numberSeasons;
    }

    public String getHorizontalImageUrl() {
        return horizontalImageUrl;
    }

    public void setHorizontalImageUrl(String horizontalImageUrl) {
        this.horizontalImageUrl = horizontalImageUrl;
    }

    public String getVerticalImageUrl() {
        return verticalImageUrl;
    }

    public void setVerticalImageUrl(String verticalImageUrl) {
        this.verticalImageUrl = verticalImageUrl;
    }

    public Boolean getFavorited() {
        return isFavorited;
    }

    public void setFavorited(Boolean favorited) {
        isFavorited = favorited;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }

    public Boolean getWasCanceled() {
        return wasCanceled;
    }

    public void setWasCanceled(Boolean wasCanceled) {
        this.wasCanceled = wasCanceled;
    }

    public Boolean getAddedToWishlist() {
        return isAddedToWishlist;
    }

    public void setAddedToWishlist(Boolean addedToWishlist) {
        isAddedToWishlist = addedToWishlist;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.mainDirector);
        dest.writeString(this.dateRelease);
        dest.writeInt(this.numberSeasons);
        dest.writeString(this.horizontalImageUrl);
        dest.writeString(this.verticalImageUrl);
        dest.writeValue(this.isFavorited);
        dest.writeValue(this.isFinished);
        dest.writeValue(this.wasCanceled);
        dest.writeValue(this.isAddedToWishlist);
    }

    public Series() {
    }

    protected Series(Parcel in) {
        this.name = in.readString();
        this.mainDirector = in.readString();
        this.dateRelease = in.readString();
        this.numberSeasons = in.readInt();
        this.horizontalImageUrl = in.readString();
        this.verticalImageUrl = in.readString();
        this.isFavorited = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isFinished = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.wasCanceled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isAddedToWishlist = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<Series> CREATOR = new Parcelable.Creator<Series>() {
        @Override
        public Series createFromParcel(Parcel source) {
            return new Series(source);
        }

        @Override
        public Series[] newArray(int size) {
            return new Series[size];
        }
    };
}
