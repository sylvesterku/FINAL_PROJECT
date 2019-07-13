package com.sda.steelprofiles.finalApp.services.servicesImpl;

import com.sda.steelprofiles.finalApp.dtos.OrderDTO;
import com.sda.steelprofiles.finalApp.entities.Order;
import com.sda.steelprofiles.finalApp.repositories.OrderRepository;
import com.sda.steelprofiles.finalApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order create(OrderDTO orderDTO) {
        Order order = new Order();
        order.setDateCreated(LocalDate.now());
        return this.orderRepository.save(order);
    }

    @Override
    public void update(OrderDTO orderDTO) {
        Order order = orderRepository.findById(orderDTO.getId()).orElse(null);
        this.orderRepository.save(order);
    }
}
