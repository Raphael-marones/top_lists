package com.example.raphaelsantos.toplistsapp.domain.models.tmdb.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.raphaelsantos.toplistsapp.domain.models.tmdb.IDNameAbstract;
import com.example.raphaelsantos.toplistsapp.domain.models.tmdb.media.AlternativeTitle;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Tiago Henrique on 24/08/2016.
 */
public class AlternativeTitlesResponse extends IDNameAbstract implements Parcelable {

    @JsonProperty("titles")
    private List<AlternativeTitle> mAlternativeTitles;

    public List<AlternativeTitle> getAlternativeTitles() {
        return mAlternativeTitles;
    }

    public void setAlternativeTitles(List<AlternativeTitle> alternativeTitles) {
        mAlternativeTitles = alternativeTitles;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.mAlternativeTitles);
    }

    public AlternativeTitlesResponse() {
    }

    protected AlternativeTitlesResponse(Parcel in) {
        this.mAlternativeTitles = in.createTypedArrayList(AlternativeTitle.CREATOR);
    }

    public static final Parcelable.Creator<AlternativeTitlesResponse> CREATOR = new Parcelable.Creator<AlternativeTitlesResponse>() {
        @Override
        public AlternativeTitlesResponse createFromParcel(Parcel source) {
            return new AlternativeTitlesResponse(source);
        }

        @Override
        public AlternativeTitlesResponse[] newArray(int size) {
            return new AlternativeTitlesResponse[size];
        }
    };
}
