package com.avs.flexboxexample.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.avs.flexboxexample.R
import com.google.android.flexbox.AlignItems
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso
import android.content.Context

abstract class FlexBoxViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        val params = itemView.layoutParams
        if (params is FlexboxLayoutManager.LayoutParams) {
            params.flexShrink = 0.0f
            params.alignSelf = AlignItems.FLEX_START
        }
    }
}

class MenuAdapter(private val dataSet: List<Dish>, private val context: Context?): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    private val inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    class ViewHolder(view: View) : FlexBoxViewHolder(view) {
        val title: TextView = view.findViewById(R.id.dishName)
        val description: TextView = view.findViewById(R.id.description)
        val preview: ShapeableImageView = view.findViewById(R.id.preview)
        val ingredients: LinearLayout = view.findViewById(R.id.ingredientsLayout)
        val seeMore: TextView = view.findViewById(R.id.seeMore)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val dish = dataSet[position]
        viewHolder.apply {
            title.text = dish.title
            description.text = dish.description

            Picasso.get()
                .load(dish.previewUrl)
                .into(preview)

            dish.ingredients.forEach { ingredient ->
                val offerView = inflater.inflate(R.layout.list_item_ingridient, null) as TextView
                offerView.text = ingredient
                ingredients.addView(offerView)
            }

            val ingredientsLeft = dish.totalIngredientsCount - dish.ingredients.size
            if (ingredientsLeft > 0) {
                seeMore.text = context?.resources?.getQuantityString(R.plurals.see_more, ingredientsLeft, ingredientsLeft.toString())
                seeMore.visibility = View.VISIBLE
            }
        }
    }

    override fun getItemCount() = dataSet.size
}