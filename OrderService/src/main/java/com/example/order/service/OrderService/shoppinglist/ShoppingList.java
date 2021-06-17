package com.example.order.service.OrderService.shoppinglist;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {

    public ShoppingList(Oranges oranges, Apples apples) {
        this.oranges = oranges;
        this.apples = apples;
    }

    public ShoppingList() {
    }

    Oranges oranges;
    Apples apples;
    private String[] orderSummary;
    private double orderTotal;

    private static String ORANGES_ORDERED = "Oranges Ordered";
    private static String APPLES_ORDERED = "Apples Ordered";
    private static String TOTAL_AMOUNT = "Total Amount";

    public Oranges getOranges() {
        return oranges;
    }

    public void setOranges(Oranges oranges) {
        this.oranges = oranges;
    }

    public Apples getApples() {
        return apples;
    }

    public void setApples(Apples apples) {
        this.apples = apples;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal() {
        orderTotal = getApples().getTotal() + getOranges().getTotal();
    }

    public Map<String, String> setOrderSummary() {
        Map<String, String> orderSummary = new HashMap<>();
        orderSummary.put(ORANGES_ORDERED, getOranges().getNumberOrdered().toString());
        orderSummary.put(APPLES_ORDERED, getApples().getNumberOrdered().toString());
        orderSummary.put(TOTAL_AMOUNT, getOrderTotal().toString());
        return orderSummary;
    }
}
