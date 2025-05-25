package com.company.cash.service;

import com.company.cash.model.CashOrder;
import com.company.cash.model.OrderType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CashService {
    private final List<CashOrder> orders = new ArrayList<>();

    public void addOrder(CashOrder order) {
        orders.add(order);
    }

    public double getBalance() {
        return orders.stream()
                .mapToDouble(order -> order.getType() == OrderType.INCOME ? order.getAmount() : -order.getAmount())
                .sum();
    }

    public List<CashOrder> getAllOrders() {
        return orders;
    }
}
