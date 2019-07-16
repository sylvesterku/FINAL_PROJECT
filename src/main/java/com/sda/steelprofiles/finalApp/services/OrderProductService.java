package com.sda.steelprofiles.finalApp.services;

import com.sda.steelprofiles.finalApp.dtos.OrderProductDTO;
import com.sda.steelprofiles.finalApp.entities.OrderProduct;

public interface OrderProductService {
    OrderProduct create(OrderProductDTO orderProductDTO);
}