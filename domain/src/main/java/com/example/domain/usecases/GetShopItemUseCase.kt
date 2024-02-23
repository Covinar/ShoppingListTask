package com.example.domain.usecases

import com.example.domain.models.ShopItem

interface GetShopItemUseCase {

    fun getShopItem(shopItemId: Int) : ShopItem

}