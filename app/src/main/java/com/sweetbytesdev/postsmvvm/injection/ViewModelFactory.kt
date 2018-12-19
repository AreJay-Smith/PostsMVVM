package com.sweetbytesdev.postsmvvm.injection

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import com.sweetbytesdev.postsmvvm.database.AppDatabase
import com.sweetbytesdev.postsmvvm.ui.PostListViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val activity: AppCompatActivity) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostListViewModel::class.java)) {
            val db = Room.databaseBuilder(activity.applicationContext, AppDatabase::class.java, "post").build()
            @Suppress("UNCHECKED_CAST")
            return PostListViewModel(db.postDao()) as T
        }
        throw IllegalArgumentException("Unknonw viewModel class")
    }

}