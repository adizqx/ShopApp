package com.example.shopapp.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.shopapp.model.ShopItemDbModel
import com.example.shopapp.data.ShopListRepositoryImpl
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ShopListRepositoryImpl(application)

    val shopList = repository.getShopList()

    fun deleteShopItem(shopListDbModel: ShopItemDbModel) {
        viewModelScope.launch {
            repository.deleteShopItem(shopListDbModel)
        }
    }

    fun changeEnableState(shopListDbModel: ShopItemDbModel) {
        viewModelScope.launch {
            val newItem = shopListDbModel.copy(enabled = !shopListDbModel.enabled)
            repository.editShopItem(newItem)
        }
    }

}