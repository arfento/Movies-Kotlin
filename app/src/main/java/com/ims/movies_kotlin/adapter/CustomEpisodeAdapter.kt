package com.ims.movies_kotlin.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ims.movies_kotlin.R
import com.ims.movies_kotlin.databinding.ItemContainerEpisodeBinding
import com.ims.movies_kotlin.response.episode.ResponseEpisodes

class CustomEpisodeAdapter(
    private var episodeList: List<ResponseEpisodes>? = null
) : RecyclerView.Adapter<CustomEpisodeAdapter.EpisodeViewHolder>() {

    private var layoutInflater: LayoutInflater? = null

    class EpisodeViewHolder(itemContainerEpisodeBinding: ItemContainerEpisodeBinding) : RecyclerView.ViewHolder(itemContainerEpisodeBinding.root) {
        private val itemContainerEpisodeBinding : ItemContainerEpisodeBinding
        fun bindEpisode(responseEpisodes: ResponseEpisodes) {
            var title = "S"
            var season : String = java.lang.String.valueOf(responseEpisodes.season)
            if (season.length == 1){
                season = "0$season"

            }
            var episodeNumber : String = java.lang.String.valueOf(responseEpisodes.episode)
            if (episodeNumber.length == 1){
                episodeNumber = "0$episodeNumber"
            }
            episodeNumber = "E$episodeNumber"
            title = title + season + episodeNumber
            itemContainerEpisodeBinding.title = title
            itemContainerEpisodeBinding.name = responseEpisodes.name
            itemContainerEpisodeBinding.airDate = responseEpisodes.air_date
        }
        init {
            this.itemContainerEpisodeBinding = itemContainerEpisodeBinding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }

        val itemContainerEpisodeBinding: ItemContainerEpisodeBinding =
            DataBindingUtil.inflate(
                layoutInflater!!,
                R.layout.item_container_episode,
                parent,
            false
        )
        return EpisodeViewHolder(itemContainerEpisodeBinding)
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.bindEpisode(episodeList!![position])
    }

    override fun getItemCount(): Int {
        return episodeList!!.size
    }
}