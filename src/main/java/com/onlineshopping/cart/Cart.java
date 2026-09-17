package com.onlineshopping.cart;

import java.util.ArrayList;
import java.util.List;

import com.onlineshopping.product.Product;

public class Cart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added to cart.");
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    public void displayCart() {
        System.out.println("Items in Cart: " + products.size());
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}