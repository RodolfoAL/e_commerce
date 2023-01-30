package services;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingKart {

    private ShoppingKart shoppingKart = new ShoppingKart();

    public ShoppingKart() {
        this.listToBuy = new ArrayList<>();
    }

    public List<Product> listToBuy;


    public List<Product> getListToBuy() {
        return listToBuy;
    }

    public void addListToBuy(Product listToBuy) {
        shoppingKart.listToBuy.add(listToBuy);
    }
}

