package com.example.googlesignindemo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "table_name", indices = @Index(value = {"token_id"}, unique = true))
public class MainData implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int ID;

    @ColumnInfo(name = "token_id")
    private String token_id;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    public String getToken_id() {
        return token_id;
    }

}
