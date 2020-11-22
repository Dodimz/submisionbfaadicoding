package com.demzet.githubsubmision1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter (val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    //private val mData = ArrayList<Model>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems (model: Model) {
            itemView.nameTv.text = model.Name
            itemView.companyTv.text = model.Company
            itemView.locationTv.text = model.Location
            itemView.imagelv.setImageResource(model.Avatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    internal fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Model, position: Int)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(arrayList[holder.adapterPosition], position)

        }

    }
}