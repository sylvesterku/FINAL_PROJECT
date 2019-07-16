package com.sda.steelprofiles.finalApp.services.servicesImpl;

import com.sda.steelprofiles.finalApp.dtos.OrderDTO;
import com.sda.steelprofiles.finalApp.entities.Order;
import com.sda.steelprofiles.finalApp.repositories.OrderRepository;
import com.sda.steelprofiles.finalApp.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, ModelMapper modelMapper) {
        this.orderRepository = orderRepository;
        this.modelMapper = modelMapper;
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

    public List<OrderDTO> findAll() {
        return orderRepository
                .findAll()
                .stream()
                .map(order -> modelMapper.map(order, OrderDTO.class))
                .collect(Collectors.toList());
    }
}
