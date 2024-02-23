package com.example.domain.usecases

import androidx.lifecycle.LiveData
import com.example.domain.models.ShopItem

interface GetShopListUseCase {

    fun getShopList() : LiveData<List<ShopItem>>

}