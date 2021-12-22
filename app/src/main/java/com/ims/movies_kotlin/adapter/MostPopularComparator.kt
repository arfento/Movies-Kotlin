package com.ims.movies_kotlin.adapter

import androidx.recyclerview.widget.DiffUtil
import com.ims.movies_kotlin.response.popular.ResponseTv_shows

object MostPopularComparator : DiffUtil.ItemCallback<ResponseTv_shows>() {
    override fun areItemsTheSame(oldItem: ResponseTv_shows, newItem: ResponseTv_shows): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ResponseTv_shows, newItem: ResponseTv_shows): Boolean {
        return oldItem == newItem
    }

}