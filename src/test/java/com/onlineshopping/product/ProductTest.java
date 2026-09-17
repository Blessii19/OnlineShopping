package com.onlineshopping.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void productPriceTest() {

        Product product = new Product(101, "Laptop", 55000);

        assertEquals(55000, product.getPrice());
    }

    @Test
    void productCreationTest() {

        Product product = new Product(102, "Mobile", 25000);

        assertNotNull(product);
    }
}