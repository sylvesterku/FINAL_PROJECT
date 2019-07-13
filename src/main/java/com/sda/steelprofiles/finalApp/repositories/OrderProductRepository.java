package com.sda.steelprofiles.finalApp.repositories;

import com.sda.steelprofiles.finalApp.entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {

}
