package com.company.cash.controller;

import com.company.cash.model.CashOrder;
import com.company.cash.service.CashService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cash")
public class CashController {

    private final CashService service;

    public CashController(CashService service) {
        this.service = service;
    }

    @PostMapping("/order")
    public String createOrder(@RequestBody CashOrder order) {
        service.addOrder(order);
        return "Операцію збережено";
    }

    @GetMapping("/balance")
    public Map<String, Object> getBalance() {
        return Map.of(
                "balance", service.getBalance(),
                "currency", "UAH"
        );
    }

    @GetMapping("/orders")
    public List<CashOrder> getAllOrders() {
        return service.getAllOrders();
    }
}
