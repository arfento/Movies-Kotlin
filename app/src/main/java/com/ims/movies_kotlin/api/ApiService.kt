package com.ims.movies_kotlin.api

import com.ims.movies_kotlin.model.popular.DataModelPapularBase
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("most-popular")
    suspend fun getMostPopularTVShows(
        @Query("page") page : Int
    ) : Response<DataModelPapularBase>


    @GET("show-details")
    fun getTVShowsDetails(
        @Query("q") tvShowId : String?
    ): Call<DataModelPapularBase>

    @GET("search")
    suspend fun getSearchTVShow(
        @Query("q") query : String?,
        @Query("page") page : Int
    ): Response<DataModelPapularBase>


}