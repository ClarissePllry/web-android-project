package com.ismin.projectapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Line::class], version = 1)
abstract class DataBase : RoomDatabase(){
    abstract fun getLineDao(): LineDao

    companion object {
        private var INSTANCE: DataBase? = null

        fun getDatabase(context: Context): DataBase {
            if (INSTANCE == null) {
                synchronized(DataBase::class) {
                    INSTANCE = Room
                        .databaseBuilder(context.applicationContext,
                            DataBase::class.java,
                            "item")
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE as DataBase
        }
    }

}