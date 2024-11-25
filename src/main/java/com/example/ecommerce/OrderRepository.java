package com.example.ecommerce;

import java.util.List;

public interface OrderRepository {
    List<Order> fetchOrders();
}
