package com.example.domain.usecases

import com.example.domain.gateways.ShopListGateway
import com.example.domain.models.ShopItem

class EditShopItemUseCaseImpl(
    private val shopItemGateway: ShopListGateway
) : EditShopItemUseCase {

    override fun editShopItem(shopItem: ShopItem) {
        shopItemGateway.editShopItem(shopItem)
    }

}