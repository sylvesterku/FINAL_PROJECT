package com.sda.steelprofiles.finalApp.services.servicesImpl;

import com.sda.steelprofiles.finalApp.dtos.OrderProductDTO;
import com.sda.steelprofiles.finalApp.entities.OrderProduct;
import com.sda.steelprofiles.finalApp.repositories.CsectionRepository;
import com.sda.steelprofiles.finalApp.repositories.OrderProductRepository;
import com.sda.steelprofiles.finalApp.repositories.OrderRepository;
import com.sda.steelprofiles.finalApp.services.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;
    private CsectionRepository csectionRepository;
    private OrderRepository orderRepository;

    @Autowired
    public OrderProductServiceImpl(OrderProductRepository orderProductRepository, CsectionRepository csectionRepository, OrderRepository orderRepository) {
        this.orderProductRepository = orderProductRepository;
        this.csectionRepository = csectionRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderProduct create(OrderProductDTO orderProductDTO) {
        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setCsection(csectionRepository.findById(orderProductDTO.getId()).orElse(null));
        orderProduct.setQuantity(orderProductDTO.getQuantity());
        orderProduct.setOrder(orderRepository.findById(orderProductDTO.getId()).orElse(null));
        return this.orderProductRepository.save(orderProduct);
    }
}