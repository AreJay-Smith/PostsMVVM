package com.sweetbytesdev.postsmvvm.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.sweetbytesdev.postsmvvm.model.Post
import com.sweetbytesdev.postsmvvm.model.PostDao

@Database(entities = [Post::class], version = 1)
abstract  class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}