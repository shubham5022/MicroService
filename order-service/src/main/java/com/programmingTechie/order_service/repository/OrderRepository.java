package com.programmingTechie.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.programmingTechie.order_service.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

	
}
