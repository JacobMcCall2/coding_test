package com.example.order.service.OrderService;

import com.example.order.service.OrderService.controllers.OrderController;
import com.example.order.service.OrderService.shoppinglist.Apples;
import com.example.order.service.OrderService.shoppinglist.Oranges;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OrderServiceApplicationTests {

	@Autowired
	OrderController orderController;

	Apples apples = new Apples();
	Oranges oranges = new Oranges();

	@Test
	void orderOrangesAndApplesAndGetOrderSummary() {
		Map<String, Integer> order = new HashMap<>();
		order.put("Oranges", 2);
		order.put("Apples", 4);
		Map<String, String> summary = orderController.submitOrder(order);
		assertThat(summary.get("Oranges Ordered")).isEqualTo("2");
		assertThat(summary.get("Apples Ordered")).isEqualTo("4");
		Double orderTotal = (oranges.getCost() * 2) + (apples.getCost() * 4);
		assertThat(summary.get("Total Amount")).isEqualTo(orderTotal.toString());
	}

}
