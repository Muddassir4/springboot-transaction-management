package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
