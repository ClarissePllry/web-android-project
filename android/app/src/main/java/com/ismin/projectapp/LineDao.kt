package com.ismin.projectapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LineDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(line: Line)

    @Query("SELECT * FROM line")
    fun getAllLines(): List<Line>
}
