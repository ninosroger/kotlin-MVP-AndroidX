package com.ninos.kotlin_mvp_androidx.repository.localdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "demo_table")
data class MainEntity constructor(@ColumnInfo(name = "app_log") var appLog: String) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}
