package me.daffakurnia.android.firstsubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListUserAdapter(private val listUser: ArrayList<User>): RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUser: ImageView = itemView.findViewById(R.id.img_user)
        var textUsername: TextView = itemView.findViewById(R.id.text_username)
        var textName: TextView = itemView.findViewById(R.id.text_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_user, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (username, name, photo) = listUser[position]
        holder.imgUser.setImageResource(photo!!)
        holder.textUsername.text = username
        holder.textName.text = name
    }

    override fun getItemCount(): Int = listUser.size
}