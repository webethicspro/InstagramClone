package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("m1zOoWUaqEbqrogYW0kYonJ3A1Jjy8QKVvXU42VB")
                // if defined
                .clientKey("hHD9u52rcp0S1ZvAHrRElcMLAD7NPvdI7XxMhIHg")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
