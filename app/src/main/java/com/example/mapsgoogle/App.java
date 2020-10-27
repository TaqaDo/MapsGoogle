package com.example.mapsgoogle;

import android.app.Application;

import androidx.room.Room;

import com.example.mapsgoogle.data.local.room.CoordinatesDatabase;

public class App extends Application {
    public static CoordinatesDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
       database = Room.databaseBuilder(this, CoordinatesDatabase.class,"FigureDatabase")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

}
