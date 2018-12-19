package com.sweetbytesdev.postsmvvm.network

import com.sweetbytesdev.postsmvvm.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}