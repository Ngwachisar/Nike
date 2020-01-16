package com.example.project3.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project3.R
import com.example.project3.model.Users

class UsersViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var profileImage = itemView.findViewById<ImageView>(R.id.img_profileimage)
    var userName = itemView.findViewById<TextView>(R.id.txt_name)
    var status = itemView.findViewById<TextView>(R.id.txt_status)
    var postImage = itemView.findViewById<ImageView>(R.id.img_postedimage)
}

class UsersAdapter (var usersList:ArrayList<Users>):RecyclerView.Adapter<UsersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.inner_layout,parent,false)
        return UsersViewHolder(view)
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.profileImage.setImageResource(usersList[position].profileImage)
        holder.userName.text = usersList[position].name
        holder.status.text = usersList[position].status
        holder.postImage.setImageResource(usersList[position].postImage)
    }

}