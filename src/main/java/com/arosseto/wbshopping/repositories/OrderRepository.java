package com.arosseto.wbshopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arosseto.wbshopping.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
