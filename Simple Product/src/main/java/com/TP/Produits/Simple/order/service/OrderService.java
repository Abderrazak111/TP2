package com.TP.Produits.Simple.order.service;

import com.TP.Produits.Simple.order.dto.OrderDTO;
import java.util.List;

public interface OrderService {
    List<OrderDTO> getOrderHistoryByCustomer(Long customerId);

    List<OrderDTO> getCustomerOrderHistory(Long customerId);

    OrderDTO createOrder(OrderDTO orderDto);

    OrderDTO saveOrder(OrderDTO orderDto);

}