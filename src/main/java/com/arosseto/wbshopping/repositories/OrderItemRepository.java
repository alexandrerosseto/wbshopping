package com.arosseto.wbshopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arosseto.wbshopping.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
