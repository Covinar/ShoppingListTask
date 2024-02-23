package com.example.domain.usecases

import com.example.domain.gateways.ShopListGateway
import com.example.domain.models.ShopItem

class DeleteShopItemUseCaseImpl(
    private val shopItemGateway: ShopListGateway
) : DeleteShopItemUseCase {

    override fun deleteShopItem(shopItem: ShopItem) {
        shopItemGateway.deleteShopItem(shopItem)
    }

}