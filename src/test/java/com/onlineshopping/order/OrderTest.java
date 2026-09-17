package com.onlineshopping.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    void orderCreationTest() {

        Order order = new Order(1001, 80000);

        assertNotNull(order);
    }

    @Test
    void orderConfirmationTest() {

        Order order = new Order(1002, 50000);

        order.confirmOrder();

        assertNotNull(order);
    }
}