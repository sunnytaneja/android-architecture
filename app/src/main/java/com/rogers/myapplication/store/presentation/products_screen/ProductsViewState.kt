package com.rogers.myapplication.store.presentation.products_screen

import com.rogers.myapplication.store.domain.model.Product

data class ProductsViewState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)