package com.example.raphaelsantos.toplistsapp.domain.models.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by raphaelsantos on 12/22/17.
 */

public class Book implements Parcelable {

    private String name;

    private String genre;

    private String sinopses;

    private String author;

    private String dateRelease;

    private String horizontalImageUrl;

    private String verticalImageUrl;

    private Boolean isFavorited = false;

    private Boolean isAddedToWishlist = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
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
        dest.writeString(this.genre);
        dest.writeString(this.sinopses);
        dest.writeString(this.author);
        dest.writeString(this.dateRelease);
        dest.writeString(this.horizontalImageUrl);
        dest.writeString(this.verticalImageUrl);
        dest.writeValue(this.isFavorited);
        dest.writeValue(this.isAddedToWishlist);
    }

    public Book() {
    }

    protected Book(Parcel in) {
        this.name = in.readString();
        this.genre = in.readString();
        this.sinopses = in.readString();
        this.author = in.readString();
        this.dateRelease = in.readString();
        this.horizontalImageUrl = in.readString();
        this.verticalImageUrl = in.readString();
        this.isFavorited = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isAddedToWishlist = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel source) {
            return new Book(source);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };
}
