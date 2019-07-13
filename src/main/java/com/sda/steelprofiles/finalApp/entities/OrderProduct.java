package com.sda.steelprofiles.finalApp.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "csection_id")
    private Csection csection;

    @Column(nullable = false)
    private Integer quantity;

    public OrderProduct() {
    }

    public OrderProduct(Order order, Csection csection, Integer quantity) {
        this.order = order;
        this.csection = csection;
        this.quantity = quantity;
    }

    @Transient
    public Double getTotalPrice() {
        return getCsection().getPrice() * getQuantity();
    }

    public Long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Csection getCsection() {
        return csection;
    }

    public void setCsection(Csection csection) {
        this.csection = csection;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderProduct that = (OrderProduct) o;
        return order.equals(that.order) &&
                csection.equals(that.csection) &&
                quantity.equals(that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, csection, quantity);
    }
}
