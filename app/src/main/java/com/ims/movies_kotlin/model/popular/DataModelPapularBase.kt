package com.ims.movies_kotlin.model.popular

import com.google.gson.annotations.SerializedName
import com.ims.movies_kotlin.response.popular.ResponseTv_shows


data class DataModelPapularBase(
    @SerializedName("total") val total: Int,
    @SerializedName("page") val page: Int,
    @SerializedName("pages") val pages: Int,
    @SerializedName("tv_shows") val tv_shows: List<ResponseTv_shows>
)
