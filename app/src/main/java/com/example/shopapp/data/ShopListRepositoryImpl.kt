package com.example.shopapp.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.shopapp.model.ShopItemDbModel

class ShopListRepositoryImpl(application: Application) : IShopListRepository {

    private val shopListDao = AppDatabase.getInstance(application).shopListDao()


    override suspend fun addShopItem(shopItemDbModel: ShopItemDbModel) {
       shopListDao.addShopItem(shopItemDbModel)
    }

    override suspend fun deleteShopItem(shopItemDbModel: ShopItemDbModel) {
        shopListDao.deleteShopItem(shopItemDbModel.id)
    }

    override suspend fun editShopItem(shopItemDbModel: ShopItemDbModel) {
        shopListDao.addShopItem(shopItemDbModel)
    }

    override suspend fun getShopItem(shopItemId: Int): ShopItemDbModel {
        return shopListDao.getShopItem(shopItemId)
    }

    override fun getShopList(): LiveData<List<ShopItemDbModel>> {
        return  shopListDao.getShopList()
    }


}