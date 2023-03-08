package com.springboot.dto;

import com.springboot.entity.Order;
import com.springboot.entity.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
