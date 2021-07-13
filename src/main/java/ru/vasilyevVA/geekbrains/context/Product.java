package ru.vasilyevVA.geekbrains.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Product {
    private long id;
    private String name;
    private int cost;

    public Product() {
    }

    public Product(long id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product " +
                "индекс =" + id +
                ", название ='" + name + '\'' +
                ", цена =" + cost
                ;
    }
}