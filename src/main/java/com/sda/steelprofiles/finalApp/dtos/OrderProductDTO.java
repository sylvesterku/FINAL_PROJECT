package com.sda.steelprofiles.finalApp.dtos;

import com.sda.steelprofiles.finalApp.entities.Csection;

public class OrderProductDTO {

    private Csection csection;
    private Integer quantity;

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
}
