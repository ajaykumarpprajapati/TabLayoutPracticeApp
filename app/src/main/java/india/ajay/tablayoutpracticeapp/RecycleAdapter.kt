package india.ajay.tablayoutpracticeapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide

class RecycleAdapter(var userList: List<User>, var context: Context):
    RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycleview_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val user = userList[position]
        viewHolder.nameTextView.text = user.name
        viewHolder.descTextView.text = user.desc
        //Will use glide library to load images since it makes recyclerview faster while scrolling
        //viewHolder.imageView.setImageResource(user.userImage)
        Glide.with(context).load(user.userImage).into(viewHolder.imageView)
        viewHolder.linearLayout?.setOnClickListener {
            //click event call
        }
    }

}