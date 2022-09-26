package com.example.lab3.adapter

//import com.example.lab3.const.Layout
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.R
import com.example.lab3.model.Muscle_Exercises

/** TODO change this
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class ExerciseCardAdapter(
    private val context: Context?,
    private val my_excercises: Muscle_Exercises
): RecyclerView.Adapter<ExerciseCardAdapter.ExerciseCardViewHolder>() {

    //Initialize the data using the List found in data/DataSource TODO
    val type = my_excercises.my_muscle
    val exercises = my_excercises.exercises

    /**
     * Initialize view elements TODO
     */
    class ExerciseCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        var exercise_gif_id = view?.findViewById<pl.droidsonroids.gif.GifImageView>(R.id.exercise_gif)
        var exercise_name = view?.findViewById<TextView>(R.id.exercise_name)
        var exercise_description = view?.findViewById<TextView>(R.id.exercise_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseCardViewHolder {
        var layout_view: View? = null
        layout_view = LayoutInflater.from(parent.context).inflate(R.layout.vertical_card, parent, false)

        return ExerciseCardViewHolder(layout_view)
    }

    override fun getItemCount(): Int =  exercises.size //Return the size of the dataset TODO

    override fun onBindViewHolder(holder: ExerciseCardViewHolder, position: Int) {
        //Get the resources from context
        val resources = context?.resources

        //For the current tree, apply to the holder the 4 tree variables TODO
        exercises[position].apply {
            holder.apply {
                exercise_gif_id?.setImageResource(gifResourceId)
                exercise_name?.text = name
                exercise_description?.text = description

            }
        }
    }
}
