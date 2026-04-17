
package com.example.hexagonal.domain.model;

import java.time.LocalDate;

public record Order(int id, String customerName, String productCategory, double amount, LocalDate orderDate) { }
