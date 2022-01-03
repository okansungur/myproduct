package com.example.samples.products.entity;


import javax.persistence.*;

@Entity
@Table(name = "product", schema = "shopping")
public class Product {
    @Id
    @Column(name = "productid")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private double cost;

    @Column(name = "stock")
    private int stock;

    @Column(name = "manufacturerid")
    private int manufacturerid;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(int manufacturerid) {
        this.manufacturerid = manufacturerid;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

