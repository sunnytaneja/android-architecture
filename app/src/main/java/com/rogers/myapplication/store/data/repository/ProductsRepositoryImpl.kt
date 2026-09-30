package com.rogers.myapplication.store.data.repository

import arrow.core.Either
import com.rogers.myapplication.store.data.maper.toGeneralError
import com.rogers.myapplication.store.data.remote.ProductsApi
import com.rogers.myapplication.store.domain.model.NetworkError
import com.rogers.myapplication.store.domain.model.Product
import com.rogers.myapplication.store.domain.repository.ProductsRepository
import javax.inject.Inject


class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toGeneralError() }
    }
}