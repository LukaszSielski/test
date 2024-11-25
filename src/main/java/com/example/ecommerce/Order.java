
package com.example.ecommerce;

import java.time.LocalDate;

public class Order {
    private final int id;
    private final String customerName;
    private final String productCategory;
    private final double amount;
    private final LocalDate orderDate;

    public Order(int id, String customerName, String productCategory, double amount, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.productCategory = productCategory;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", amount=" + amount +
                ", orderDate=" + orderDate +
                '}';
    }
}
