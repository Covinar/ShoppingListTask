package com.example.domain.usecases

import com.example.domain.gateways.ShopListGateway
import com.example.domain.models.ShopItem

class GetShopItemUseCaseImpl(
    private val shopItemGateway: ShopListGateway
) : GetShopItemUseCase {
    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopItemGateway.getShopItem(shopItemId)
    }
}