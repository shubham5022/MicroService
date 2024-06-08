package com.programmingTechie.order_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.programmingTechie.order_service.controller.dto.OrderLineItemsDto;
import com.programmingTechie.order_service.controller.dto.OrderRequest;
import com.programmingTechie.order_service.model.Order;
import com.programmingTechie.order_service.model.OrderLineItems;
import com.programmingTechie.order_service.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepository;

	public void placeOrder(OrderRequest orderRequest) {

		Order order = new Order();
		order.setOrderNumber(UUID.randomUUID().toString());

		List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList().stream()
				.map(orderLineItemsDto -> mapToDto(orderLineItemsDto)).toList();
			order.setOrderLineItemsList(orderLineItems);
		//calling
			
			orderRepository.save(order);
			
	}

	private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
		OrderLineItems orderLineItems = new OrderLineItems();
		orderLineItems.setPrice(orderLineItemsDto.getPrice());
		orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
		orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());

		return orderLineItems;
	}

}
