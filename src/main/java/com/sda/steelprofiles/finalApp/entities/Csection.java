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
    private String hieght;

    @Column(nullable = false)
    private String weight;

    @Column(nullable = false)
    private String jm;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String quantity;

    public Csection() {
    }

    public Csection(String name, String hieght, String weight, String jm, String price, String quantity) {
        this.name = name;
        this.hieght = hieght;
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

    public String getHieght() {
        return hieght;
    }

    public void setHieght(String hieght) {
        this.hieght = hieght;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "C-section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hieght='" + hieght + '\'' +
                ", weight='" + weight + '\'' +
                ", jm='" + jm + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
