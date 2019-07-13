package com.sda.steelprofiles.finalApp.services;

import com.sda.steelprofiles.finalApp.dtos.OrderDTO;
import com.sda.steelprofiles.finalApp.entities.Order;

public interface OrderService {

    Iterable<Order> getAllOrders();
    Order create(OrderDTO orderDTO);
    void update(OrderDTO orderDTO);
}