package dataBase;

import model.Client;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class StockDataBase {

    private static StockDataBase dataBase = new StockDataBase();

    public StockDataBase() {
        this.products = new ArrayList<>();
    }

    public static List<Product> products;

    public static List<Product> getProducts() {
        return products;
    }
    public static void addProducts(Product products) {
        dataBase.products.add(products);
    }
}
