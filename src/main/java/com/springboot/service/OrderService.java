package com.springboot.service;

import com.springboot.dto.OrderRequest;
import com.springboot.dto.OrderResponse;

public interface OrderService {

	OrderResponse placeOrder(OrderRequest orderRequest);
}
