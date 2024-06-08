package com.programmingTechie.inventory_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.programmingTechie.inventory_service.repository.InventoryRepository;



@Service
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;
	
	@Transactional(readOnly=true)
	public boolean isInStock(String skuCode) {
		return inventoryRepository.findBySkuCode(skuCode).isPresent();
		
	}
	
}
