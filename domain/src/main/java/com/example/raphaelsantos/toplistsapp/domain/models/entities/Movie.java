package com.example.raphaelsantos.toplistsapp.domain.models.entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.URI;

/**
 * Created by raphaelsantos on 12/22/17.
 */

public class Movie implements Parcelable {

    private String name;

    private String genre;

    private String sinopses;

    private String director;

    private String dateRelease;

    private String horizontalImageUrl;

    private String verticalImageUrl;

    private Boolean isFavorited = false;

    private Boolean isInMovies = false;

    private Boolean isAddedToWishlist = false;


    public String getHorizontalImageUrl() {
        return horizontalImageUrl;
    }

    public void setHorizontalImageUrl(URI horizontalImageUrl) {
        this.horizontalImageUrl = horizontalImageUrl.toString();
    }

    public String getVerticalImageUrl() {
        return verticalImageUrl;
    }

    public void setVerticalImageUrl(String verticalImageUrl) {
        this.verticalImageUrl = verticalImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHorizontalImageUrl(String horizontalImageUrl) {
        this.horizontalImageUrl = horizontalImageUrl;
    }

    public Boolean getInMovies() {
        return isInMovies;
    }

    public void setInMovies(Boolean inMovies) {
        isInMovies = inMovies;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    public Boolean getFavorited() {
        return isFavorited;
    }

    public void setFavorited(Boolean favorited) {
        isFavorited = favorited;
    }

    public Boolean getAddedToWishlist() {
        return isAddedToWishlist;
    }

    public void setAddedToWishlist(Boolean addedToWishlist) {
        isAddedToWishlist = addedToWishlist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopses() {
        return sinopses;
    }

    public void setSinopses(String sinopses) {
        this.sinopses = sinopses;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.genre);
        dest.writeString(this.sinopses);
        dest.writeString(this.director);
        dest.writeString(this.dateRelease);
        dest.writeString(this.horizontalImageUrl);
        dest.writeString(this.verticalImageUrl);
        dest.writeValue(this.isFavorited);
        dest.writeValue(this.isInMovies);
        dest.writeValue(this.isAddedToWishlist);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.name = in.readString();
        this.genre = in.readString();
        this.sinopses = in.readString();
        this.director = in.readString();
        this.dateRelease = in.readString();
        this.horizontalImageUrl = in.readString();
        this.verticalImageUrl = in.readString();
        this.isFavorited = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isInMovies = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isAddedToWishlist = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
