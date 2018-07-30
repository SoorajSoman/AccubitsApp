package com.project.sooraj.accubitsapp.db;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import com.project.sooraj.accubitsapp.dao.DbDao;
import com.project.sooraj.accubitsapp.model.Datum;

@Database(entities = {Datum.class}, version = 1)
public abstract class Datadb extends RoomDatabase {

    public abstract DbDao DbDao();

    private static Datadb INSTANCE;


    static Datadb getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (Datadb.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Datadb.class, "MyDb")
                            .build();

                }
            }
        }
        return INSTANCE;
    }

}