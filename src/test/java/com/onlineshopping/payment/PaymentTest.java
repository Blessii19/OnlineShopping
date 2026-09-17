package com.onlineshopping.payment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    @Test
    void successfulPaymentTest() {

        Payment payment = new Payment();

        boolean result = payment.processPayment(50000);

        assertTrue(result);
    }

    @Test
    void failedPaymentTest() {

        Payment payment = new Payment();

        boolean result = payment.processPayment(0);

        assertFalse(result);
    }
}