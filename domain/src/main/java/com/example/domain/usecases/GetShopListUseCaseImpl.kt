package com.example.domain.usecases

import androidx.lifecycle.LiveData
import com.example.domain.gateways.ShopListGateway
import com.example.domain.models.ShopItem

class GetShopListUseCaseImpl(
    private val shopItemGateway: ShopListGateway
) : GetShopListUseCase {

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopItemGateway.getShopList()
    }

}