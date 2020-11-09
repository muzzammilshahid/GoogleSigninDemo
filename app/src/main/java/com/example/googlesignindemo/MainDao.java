package com.example.googlesignindemo;

import androidx.room.Dao;
import androidx.room.Insert;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MainDao {

    @Insert(onConflict = REPLACE)
    void insert(MainData mainData);

}