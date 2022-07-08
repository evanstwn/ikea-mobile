package com.example.finalproject.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalproject.R
import com.example.finalproject.model.Item

class ItemAdapter(private val itemList: ArrayList<Item>) :
    RecyclerView.Adapter<ItemAdapter.PhoneViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ItemAdapter.PhoneViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_ikea, parent, false)
        return PhoneViewHolder(view)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ItemAdapter.PhoneViewHolder, position: Int) {
        val item = itemList[position]
        var flag = false

        Glide.with(holder.itemView.context)
            .load(item.img)
            .fitCenter()
            .into(holder.imgPhoto)

        holder.tvName.text = item.name
        holder.tvActualName.text = item.actualName
        holder.tvAdvertisement.text = item.advertisement
        holder.tvPrice.text = item.price

        holder.btnAdd.setBackgroundResource(R.color.blue)

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(itemList[holder.adapterPosition])
        }

        holder.btnAdd.setOnClickListener {
            if(!flag){
                Toast.makeText(holder.itemView.context, "${item.name} berhasil ditambahkan ke keranjang!", Toast.LENGTH_SHORT).show()
                holder.btnAdd.setBackgroundResource(R.color.yellow)
            } else {
                Toast.makeText(holder.itemView.context, "${item.name} berhasil dihapus dari keranjang!", Toast.LENGTH_SHORT).show()
                holder.btnAdd.setBackgroundResource(R.color.blue)
            }
            flag = !flag
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Item)
    }

    inner class PhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvActualName: TextView = itemView.findViewById(R.id.tv_item_actual_name)
        var tvAdvertisement: TextView = itemView.findViewById(R.id.tv_item_advertisement)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item)
        var btnAdd: ImageButton = itemView.findViewById(R.id.btn_add)
    }

}