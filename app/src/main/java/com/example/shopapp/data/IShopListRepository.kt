package com.example.shopapp.data

import androidx.lifecycle.LiveData
import com.example.shopapp.model.ShopItemDbModel

interface IShopListRepository {
   suspend fun addShopItem(shopItemDbModel: ShopItemDbModel)
   suspend fun deleteShopItem(shopItemDbModel: ShopItemDbModel)
   suspend fun editShopItem(shopItemDbModel: ShopItemDbModel)
   suspend fun getShopItem(shopItemId: Int): ShopItemDbModel
   fun getShopList(): LiveData<List<ShopItemDbModel>>
}