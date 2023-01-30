package model;

import enuns.TypeOfProcucts;

public class Product {

    private TypeOfProcucts type;
    private String idNumber;
    private String name;
    private String description;
    private float price;

    public Product(TypeOfProcucts type, String idNumber,String name, String description, float price) {
        this.type = type;
        this.idNumber = idNumber;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public TypeOfProcucts getType() {
        return type;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

}
