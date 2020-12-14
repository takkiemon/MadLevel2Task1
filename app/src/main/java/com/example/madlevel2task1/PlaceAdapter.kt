package com.example.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter(private val places: List<Place>) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place) {
            binding.tvPlace.text = place.name
            binding.ivPlace.setImageResource(place.imageResId)
        }
    }

    /**
     * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    /**
     * Returns the size of the list
     */
    override fun getItemCount(): Int {
        return places.size
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     */
    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
        holder.databind(places[position])
    }
}