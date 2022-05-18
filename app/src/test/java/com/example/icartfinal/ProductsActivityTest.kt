package com.example.icartfinal


import junit.framework.Assert.assertFalse
import org.junit.Test

class ProductsActivityTest {

    @Test
    fun addProductTest() {
        assert(true) { ShoppingList.addToList("Estropajo") }
    }

    @Test
    fun addSameProductTest() {
        ShoppingList.addToList("Manzana")
        assertFalse(ShoppingList.addToList("Manzana"))
    }
}