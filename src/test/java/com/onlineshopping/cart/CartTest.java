package com.onlineshopping.cart;

import com.onlineshopping.product.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void addProductAndCalculateTotalTest() {

        Cart cart = new Cart();

        Product laptop = new Product(101, "Laptop", 55000);
        Product mobile = new Product(102, "Mobile", 25000);

        cart.addProduct(laptop);
        cart.addProduct(mobile);

        assertEquals(80000, cart.calculateTotal());
    }

    @Test
    void emptyCartTotalTest() {

        Cart cart = new Cart();

        assertEquals(0, cart.calculateTotal());
    }
}