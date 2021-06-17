package com.example.order.service.OrderService.controllers;

import com.example.order.service.OrderService.shoppinglist.Apples;
import com.example.order.service.OrderService.shoppinglist.Oranges;
import com.example.order.service.OrderService.shoppinglist.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class OrderController {
    private static String ORANGES = "Oranges";
    private static String APPLES = "Apples";

    @PostMapping("/submitOrder")
    public Map<String, String> submitOrder(@RequestParam Map<String, Integer> order) {
        ShoppingList shoppingList = new ShoppingList(new Oranges(order.get(ORANGES)), new Apples(order.get(APPLES)));
        shoppingList.setOrderTotal();
        return shoppingList.setOrderSummary();
    }
}
