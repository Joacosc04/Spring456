package com.example.spring456.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String operating_system;
    private String processor;
    private Integer ram;
    private Integer internal_memory;
    private Integer price;


    public Laptop() {
    }

    public Laptop(Long id, String brand, String model, String operating_system, String processor, Integer ram, Integer internal_memory, Integer price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.operating_system = operating_system;
        this.processor = processor;
        this.ram = ram;
        this.internal_memory = internal_memory;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getInternal_memory() {
        return internal_memory;
    }

    public void setInternal_memory(Integer internal_memory) {
        this.internal_memory = internal_memory;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operating_system='" + operating_system + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", internal_memory=" + internal_memory +
                ", price=" + price +
                '}';
    }
}
