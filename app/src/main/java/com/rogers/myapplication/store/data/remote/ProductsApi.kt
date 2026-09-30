package com.rogers.myapplication.store.data.remote

import com.rogers.myapplication.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>

}