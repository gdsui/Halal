package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.R
import com.example.myapplication.databinding.ListProductBinding
import com.example.myapplication.model.ProductModel

class ProductAdapter(val list: List<ProductModel>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    private lateinit var binding: ListProductBinding

    class ProductViewHolder(itemView:View) : ViewHolder(itemView) {
        private lateinit var binding: ListProductBinding

        fun bind(productModel: ProductModel) {
         binding.tvProductName.text=productModel.productName
         binding.productTitle.text=productModel.productTitle
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        binding= ListProductBinding.inflate(LayoutInflater.from(parent.context))
        return ProductViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
     return list.size
    }
}