package com.example.raphaelsantos.toplistsapp.domain.models.entities;

/**
 * Created by raphaelsantos on 12/22/17.
 */

public class Series {

        private String name;

        private String mainDirector;

        private String dateRelease;

        private int numberSeasons;

        private String horizontalImageUrl;

        private String verticalImageUrl;

        private Boolean isFavorited = false;

        private Boolean isFinished = true;

        private Boolean wasCanceled = true;

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

    private Boolean isAddedToWishlist = false;


    }
