package com.onlineshopping.login;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void validLoginTest() {

        Login login = new Login();

        boolean result = login.validateLogin("admin", "admin123");

        assertTrue(result);
    }

    @Test
    void invalidLoginTest() {

        Login login = new Login();

        boolean result = login.validateLogin("wrong", "wrong123");

        assertFalse(result);
    }
}