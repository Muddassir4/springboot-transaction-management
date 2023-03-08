package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
