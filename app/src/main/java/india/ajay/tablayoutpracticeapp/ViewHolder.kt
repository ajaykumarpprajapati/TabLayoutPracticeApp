package india.ajay.tablayoutpracticeapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
     var imageView = itemView.findViewById<ImageView>(R.id.image_view)
     var nameTextView = itemView.findViewById<TextView>(R.id.name_text_view)
     var descTextView = itemView.findViewById<TextView>(R.id.desc_text_view)
     var linearLayout = itemView.findViewById<LinearLayout  >(R.id.linear_layout_item)

}