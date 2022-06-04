package com.example.shopapp.presentation

import androidx.recyclerview.widget.DiffUtil
import com.example.shopapp.model.ShopItemDbModel

class ShopItemDiffCallback: DiffUtil.ItemCallback<ShopItemDbModel>() {

    override fun areItemsTheSame(oldItem: ShopItemDbModel, newItem: ShopItemDbModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItemDbModel, newItem: ShopItemDbModel): Boolean {
        return oldItem == newItem
    }
}
