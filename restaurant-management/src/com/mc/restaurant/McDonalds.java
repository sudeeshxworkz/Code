package com.mc.restaurant;

import burger.Order;

public class McDonalds {
    public static void main(String[] ord) {
        Order order = new Order();
        System.out.println(order);
        order.setOrderId(402);
        order.setOrderDate("2024-11-02");
        order.setCustomerName("James Smith");
        order.setFoodItem("Mc Aloo Tikki");
        System.out.println(order);
        System.out.println(order.hashCode());
        //System.out.println("Order ID: " + order.getOrderId());
        //System.out.println("Order Date: " + order.getOrderDate());
        //System.out.println("Customer Name: " + order.getCustomerName());
        //System.out.println("Food Item: " + order.getFoodItem());

    }
}
