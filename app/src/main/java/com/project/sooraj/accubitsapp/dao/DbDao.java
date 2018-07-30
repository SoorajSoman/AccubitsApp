package com.project.sooraj.accubitsapp.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.project.sooraj.accubitsapp.model.Datum;

import java.lang.annotation.Annotation;
import java.util.List;
@Dao
public interface DbDao {
    @Insert
    void insert(Datum data);

    @Query("DELETE FROM Data_table")
    void deleteAll();

    @Query("SELECT * from Data_table ORDER BY id ASC")
    List<Datum> getAllWords();
}
