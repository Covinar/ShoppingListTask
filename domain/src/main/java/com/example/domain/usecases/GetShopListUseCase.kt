package com.example.domain.usecases

import com.example.domain.models.ShopItem

interface GetShopListUseCase {

    fun getShopList() : List<ShopItem>

}