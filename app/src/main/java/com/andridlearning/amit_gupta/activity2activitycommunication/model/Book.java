package com.andridlearning.amit_gupta.activity2activitycommunication.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Amit_Gupta on 9/1/15.
 */
public class Book implements Parcelable {

    public  String BookName;
    public String Author;
    public int price;

    public Book(String bookName, String author, int price){
        BookName = bookName;
        Author = author;
        this.price = price;
    }

    public Book(Parcel in){
     String[] data = new String[3];
        in.readStringArray(data);
        this.BookName = data[0];
        this.Author = data[1];
        this.price = Integer.parseInt(data[2]);

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[] {this.BookName,
                this.Author,
                Integer.toString(this.price)});
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

}
