package com.company.cash.model;

public class CashOrder {
    private OrderType type;
    private double amount;
    private String account; // 33, 36, 30, etc.
    private String comment;
    public OrderType getType() {
        return type;
    }
    public void setType(OrderType type) {
        this.type = type;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
