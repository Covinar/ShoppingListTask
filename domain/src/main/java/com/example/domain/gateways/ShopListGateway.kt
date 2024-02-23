package com.example.domain.gateways

import androidx.lifecycle.LiveData
import com.example.domain.models.ShopItem

interface ShopListGateway {

    fun getShopList() : LiveData<List<ShopItem>>

    fun getShopItem(shopItemId: Int) : ShopItem

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

}