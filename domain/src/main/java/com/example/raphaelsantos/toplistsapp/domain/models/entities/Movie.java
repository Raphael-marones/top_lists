package com.example.raphaelsantos.toplistsapp.domain.models.entities;

import java.net.URI;

/**
 * Created by raphaelsantos on 12/22/17.
 */

public class Movie {

    private String name;

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
}
