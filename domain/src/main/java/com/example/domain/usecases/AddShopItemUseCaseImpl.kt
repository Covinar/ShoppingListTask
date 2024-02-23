package com.example.domain.usecases

import AddShopItemUseCase
import com.example.domain.gateways.ShopListGateway
import com.example.domain.models.ShopItem

class AddShopItemUseCaseImpl(
    private val shopItemGateway: ShopListGateway
) : AddShopItemUseCase {

    override fun addShopItem(shopItem: ShopItem) {
        shopItemGateway.addShopItem(shopItem)
    }

}