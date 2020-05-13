package com.arosseto.wbshopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arosseto.wbshopping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
