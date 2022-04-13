package com.natankayevo.mysubscribers.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Subscriber")
data class SubscriberEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "email") val email: String?
)