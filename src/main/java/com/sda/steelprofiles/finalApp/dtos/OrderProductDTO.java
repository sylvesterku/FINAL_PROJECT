package com.sda.steelprofiles.finalApp.dtos;

public class OrderProductDTO {

    private Long id;
    private Long csectionId;
    private Long orderId;
    private Integer quantity;

    public OrderProductDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getCsectionId() {
        return csectionId;
    }

    public void setCsectionId(Long csectionId) {
        this.csectionId = csectionId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
