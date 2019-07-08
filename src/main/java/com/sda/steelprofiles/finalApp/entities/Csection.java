package com.sda.steelprofiles.finalApp.entities;

import javax.persistence.*;

@Entity
public class Csection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String height;

    @Column(nullable = false)
    private String weight;

    @Column(nullable = false)
    private String jm;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private int quantity;

    public Csection() {
    }

    public Csection(String name, String height, String weight, String jm, Double price, int quantity) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.jm = jm;
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

    public void setJm(String jm) {
        this.jm = jm;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "C-section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", jm='" + jm + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
