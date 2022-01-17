package com.avs.flexboxexample.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.avs.flexboxexample.R
import com.google.android.flexbox.AlignItems
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

abstract class FlexBoxViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        val lp = itemView.layoutParams
        if (lp is FlexboxLayoutManager.LayoutParams) {
            lp.flexShrink = 0.0f
            lp.alignSelf = AlignItems.FLEX_START
        }
    }
}

class MenuAdapter(private val dataSet: List<Dish>): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    class ViewHolder(view: View) : FlexBoxViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title)
        val description: TextView = view.findViewById(R.id.description)
        val preview: ShapeableImageView = view.findViewById(R.id.preview)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.title.text = dataSet[position].title
        viewHolder.description.text = dataSet[position].description

        Picasso.get()
            .load(dataSet[position].preview)
            .into(viewHolder.preview)
    }

    override fun getItemCount() = dataSet.size


}