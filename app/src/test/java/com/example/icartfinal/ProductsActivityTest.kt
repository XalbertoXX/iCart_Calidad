/*package com.example.icartfinal


import junit.framework.Assert.assertFalse
import io.mockk.MockKAnnotations
import org.junit.Test
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Before

class ProductsActivityTest() {
    @RelaxedMockK
    private lateinit var productActivity: ProductsActivity
    lateinit var productActivity: GetQuotesUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getQuotesUseCase = GetQuotesUseCase(quoteRepository)
    @Test
    fun addProductTest() {
        assert(true) { ShoppingList.addToList("Estropajo") }
    }

    @Test
    fun addSameProductTest() {
        ShoppingList.addToList("Manzana")
        assertFalse(ShoppingList.addToList("Manzana"))
    }
}*/