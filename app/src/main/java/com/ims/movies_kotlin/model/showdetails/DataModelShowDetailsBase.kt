package com.ims.movies_kotlin.model.showdetails

import com.google.gson.annotations.SerializedName;
import com.ims.movies_kotlin.response.showdetails.ResponseTvShowDetails

data class DataModelShowDetailsBase(
    @SerializedName("tvShow") val tvShow: ResponseTvShowDetails
    ) {

}
