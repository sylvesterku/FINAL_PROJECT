package com.sda.steelprofiles.finalApp.dtos;

import java.util.Objects;

public class CsectionDTO {
    private Long id;
    private String name;
    private String height;
    private String weight;
    private final String jm = "mb";
    private Double price;
    private Integer quantity;

    public CsectionDTO() {
    }

    public CsectionDTO(Long id, String name, String height, String weight, Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getJm() {
        return jm;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        CsectionDTO that = (CsectionDTO) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
