package model;

import enuns.TypeOfProcucts;

public class Product {
    private TypeOfProcucts type;
    private String name;
    private String description;
    private float price;

    public Product(TypeOfProcucts type, String name, String description, float price) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public TypeOfProcucts getType() {
        return type;
    }

    public void setType(TypeOfProcucts type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
