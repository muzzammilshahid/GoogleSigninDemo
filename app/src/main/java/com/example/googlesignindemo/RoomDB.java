package com.example.googlesignindemo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import static androidx.room.Room.databaseBuilder;

@Database(entities = {MainData.class},version = 1,exportSchema = false)
public abstract class RoomDB extends RoomDatabase {
    private static RoomDB database;

    public synchronized static RoomDB getInstance(Context context){
        if (database == null){
            String DATABASE_NAME = "database";
            database = databaseBuilder(context.getApplicationContext(),
                    RoomDB.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return database;
    }
    public abstract MainDao mainDao();
}