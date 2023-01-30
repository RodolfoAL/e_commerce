package controller;

import model.Product;
import view.ShoppingKartView;
import view.StoreMenuView;

import java.util.ArrayList;
import java.util.List;

public class ShoppingKartEmptinessController {
    public void verifyShoppingKartEmptiness() {

        List<Product> list = new ArrayList<>();

        if (list == null) {
            System.out.println("\nSeu carrinho de compras está vazio, retorne para loja\n");
            StoreMenuView storeMenuView = new StoreMenuView();
            storeMenuView.storeMenu();
        } else if (list != null) {
            ShoppingKartView shoppingKartView = new ShoppingKartView();
            shoppingKartView.viewListOfProductsToBy();
        }
    }


}
