package com.davit.mysuperapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.davit.mysuperapp.api.dto.Resource
import com.davit.mysuperapp.database.daos.ResourceDao

@Database(entities = [Resource::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getResourcesDao(): ResourceDao
}