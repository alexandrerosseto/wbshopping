package com.arosseto.wbshopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arosseto.wbshopping.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
