package com.ninos.kotlin_mvp_androidx.repository.localdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ninos.kotlin_mvp_androidx.repository.localdb.dao.MainDao
import com.ninos.kotlin_mvp_androidx.repository.localdb.entity.MainEntity

@Database(
    version = 1, entities = [
        MainEntity::class]
)
abstract class LocalDB : RoomDatabase() {
    abstract fun mainDao(): MainDao
}