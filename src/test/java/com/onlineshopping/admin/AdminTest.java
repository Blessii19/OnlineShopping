package com.onlineshopping.admin;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class AdminTest {

    @Test
    void addProductTest() {

        Admin admin = new Admin();

        assertDoesNotThrow(() -> {
            admin.addProduct("Laptop");
        });
    }

    @Test
    void removeProductTest() {

        Admin admin = new Admin();

        assertDoesNotThrow(() -> {
            admin.removeProduct("Laptop");
        });
    }
}