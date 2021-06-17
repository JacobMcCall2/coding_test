package com.example.order.service.OrderService.shoppinglist;

public class Oranges {

    private int numberOrdered;
    private double cost = 0.25;
    private double total;

    public Oranges(int numberOrdered) {
        this.numberOrdered = numberOrdered;
        this.total = getTotal();
    }

    public Oranges() {
    }

    public Integer getNumberOrdered() {
        return numberOrdered;
    }

    public void setNumberOrdered(int numberOrdered) {
        this.numberOrdered = numberOrdered;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTotal() {
        return numberOrdered * cost;
    }
}
