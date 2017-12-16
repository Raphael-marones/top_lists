package com.example.raphaelsantos.toplistsapp.domain.models.enums.tmdb;

/**
 * Created by Tiago Henrique on 01/09/2016.
 */
public enum SearchType {
    PHRASE,
    NGRAM;

    public String getPropertyString() {
        return this.name().toLowerCase();
    }

    @Override
    public String toString() {
        return getPropertyString();
    }
}
