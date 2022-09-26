package com.example.lab3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.R
//import com.example.lab3.const.Layout
import com.example.lab3.data.DataSource

/** TODO change this
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class ExerciseCardAdapter(
    private val context: Context?
): RecyclerView.Adapter<ExerciseCardAdapter.DogCardViewHolder>() {

    //Initialize the data using the List found in data/DataSource TODO
    val exercises = DataSource.chest_exercises.exercises
    val type = DataSource.chest_exercises.my_muscle

    /**
     * Initialize view elements TODO
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        //Declare and initialiViewById<TextView>(R.id.tree_name)
        //        var tree_zones = view?.fize all of the list item UI components TODO
//        var tree_image_id = view?.findViewById<ImageView>(R.id.tree_image)
//        var tree_name = view?.findndViewById<TextView>(R.id.tree_zones)
//        var tree_growth_rate = view?.findViewById<TextView>(R.id.tree_growth_rate)

        var exercise_gif_id = view?.findViewById<pl.droidsonroids.gif.GifImageView>(R.id.exercise_gif)
        var exercise_name = view?.findViewById<TextView>(R.id.exercise_name)
        var exercise_description = view?.findViewById<TextView>(R.id.exercise_description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        var layout_view: View? = null
        layout_view = LayoutInflater.from(parent.context).inflate(R.layout.vertical_card, parent, false)

        return DogCardViewHolder(layout_view)
    }

    override fun getItemCount(): Int = 0 //exercises.size //Return the size of the dataset TODO

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        //Get the resources from context
        val resources = context?.resources
        //For the current tree, apply to the holder the 4 tree variables TODO
        exercises[position].apply {
            holder.apply {
//                tree_image_id?.setImageResource(imageResourceId)
//                tree_name?.text = name
//                tree_zones?.text = resources?.getString(R.string.tree_zones, zones)
//                tree_growth_rate?.text = resources?.getString(R.string.tree_growth_rate, growth_rate)

                exercise_gif_id?.setImageResource(gifResourceId)
                exercise_name?.text = name
                exercise_description?.text = description

            }
        }
    }
}
