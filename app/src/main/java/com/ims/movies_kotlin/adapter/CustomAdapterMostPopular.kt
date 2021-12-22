package com.ims.movies_kotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ims.movies_kotlin.databinding.ItemsMostPopularTvshowsBinding
import com.ims.movies_kotlin.response.episode.ResponseEpisodes
import com.ims.movies_kotlin.response.popular.ResponseTv_shows
import com.ims.movies_kotlin.ui.fragment.HomeFragment
import com.ims.movies_kotlin.ui.fragment.HomeFragmentDirections

class CustomAdapterMostPopular(
    diffCallback: DiffUtil.ItemCallback<ResponseTv_shows>
) :
    PagingDataAdapter<ResponseTv_shows, CustomAdapterMostPopular.MyViewHolder>(
        diffCallback
    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(
            ItemsMostPopularTvshowsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class MyViewHolder(private val binding: ItemsMostPopularTvshowsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(responsetvShows: ResponseTv_shows) = with(binding) {
            mostpopulartvshows = responsetvShows
            binding.root.setOnClickListener { v ->
                val direction = HomeFragmentDirections
                    .actionHomeFragmentToTvShowsDetailsFragment(responsetvShows)
                v.findNavController().navigate(direction)
            }

        }
    }

}