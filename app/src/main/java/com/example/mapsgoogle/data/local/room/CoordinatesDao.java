package com.example.mapsgoogle.data.local.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mapsgoogle.data.models.Coordinates;

import java.util.List;

@Dao
public interface CoordinatesDao {

    @Insert
    void putCoordinates(List<Coordinates> figure);

    @Query("SELECT * FROM Coordinates")
    List<Coordinates> getCoordinates();
}
