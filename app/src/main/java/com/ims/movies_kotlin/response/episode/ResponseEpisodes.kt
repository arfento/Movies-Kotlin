package com.ims.movies_kotlin.response.episode

import com.google.gson.annotations.SerializedName

data class ResponseEpisodes(
    @SerializedName("season") val season: Int,
    @SerializedName("episode") val episode: Int,
    @SerializedName("name") val name: String,
    @SerializedName("air_date") val air_date: String
)
