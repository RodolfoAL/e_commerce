package services;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingKart {

    private static ShoppingKart shoppingKart = new ShoppingKart();

    public ShoppingKart() {
        this.listToBuy = new ArrayList<>();
    }

    public static List<Product> listToBuy;


    public static List<Product> getListToBuy() {
        return listToBuy;
    }

    public static void addListToBuy(Product listToBuy) {
        shoppingKart.listToBuy.add(listToBuy);
    }
}

