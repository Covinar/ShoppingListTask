package com.example.domain.usecases

import com.example.domain.models.ShopItem

interface DeleteShopItemUseCase {

    fun deleteShopItem(shopItem: ShopItem)

}