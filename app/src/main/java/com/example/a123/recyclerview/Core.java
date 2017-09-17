package com.example.a123.recyclerview;

import android.app.Application;

import com.google.firebase.storage.FirebaseStorage;

public class Core extends Application {

    public static FirebaseStorage storage;

    @Override
    public void onCreate() {
        super.onCreate();

        storage = FirebaseStorage.getInstance();
    }
}