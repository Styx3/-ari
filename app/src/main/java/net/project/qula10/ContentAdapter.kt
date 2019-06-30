package net.project.qula10

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.koushikdutta.ion.Ion
import kotlinx.android.synthetic.main.row_view.view.*

class ContentAdapter(private val context: Context, private val list: List<ModelArray>) :
    RecyclerView.Adapter<ContentAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_view, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemView.ContryText.text = list[position].code +" -=- "+ (list[position].curr.toDouble()*2.83).toString()
        Ion.with(holder.itemView.CountryCode).load(list[position].img)


    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}

