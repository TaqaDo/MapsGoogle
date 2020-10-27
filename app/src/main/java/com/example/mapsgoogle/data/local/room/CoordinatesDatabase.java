package com.example.mapsgoogle.data.local.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mapsgoogle.data.models.Coordinates;

@Database(entities = {Coordinates.class},version = 1)
public abstract class CoordinatesDatabase extends RoomDatabase {
    public abstract CoordinatesDao figureDao();
}
