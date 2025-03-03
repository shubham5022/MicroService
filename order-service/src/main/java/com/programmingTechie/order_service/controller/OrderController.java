package com.programmingTechie.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.programmingTechie.order_service.controller.dto.OrderRequest;
import com.programmingTechie.order_service.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public String placeOrder(@RequestBody OrderRequest orderRequest ) {
		orderService.placeOrder(orderRequest);
		return "order placed successfully!!";
	}
}
