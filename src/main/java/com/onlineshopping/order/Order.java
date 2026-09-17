package com.onlineshopping.order;

public class Order {

    private int orderId;
    private double amount;
    private String status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = "Pending";
    }

    public void confirmOrder() {
        status = "Confirmed";
        System.out.println("Order " + orderId + " confirmed.");
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Status: " + status);
    }
}