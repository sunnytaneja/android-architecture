package com.rogers.myapplication.store.domain.repository

import arrow.core.Either
import com.rogers.myapplication.store.domain.model.NetworkError
import com.rogers.myapplication.store.domain.model.Product

interface ProductsRepository {

    suspend fun getProducts(): Either<NetworkError, List<Product>>

}
