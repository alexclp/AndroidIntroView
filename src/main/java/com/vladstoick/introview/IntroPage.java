package com.vladstoick.introview;

import android.os.Parcel;
import android.os.Parcelable;

public class IntroPage implements Parcelable{
    public String text;
    public int imgResource;

    public IntroPage(String text, int imgResource) {
        this.text = text;
        this.imgResource = imgResource;
    }

    public IntroPage(Parcel in){
        this.text = in.readString();
        this.imgResource = in.readInt();
    }

    public static final Parcelable.Creator<IntroPage> CREATOR
            = new Parcelable.Creator<IntroPage>() {
        public IntroPage createFromParcel(Parcel in) {
            return new IntroPage(in);
        }

        public IntroPage[] newArray(int size) {
            return new IntroPage[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(text);
        dest.writeInt(imgResource);
    }
}