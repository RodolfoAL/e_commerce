package controller;

import model.Client;
import view.StoreMenuView;

import java.util.List;
import static dataBase.StockDataBase.getProducts;
import static services.ShoppingKart.addListToBuy;

public class AdditionOfProductToBuy {

    public void addingToShoppingKart(String idNumberToBuy) {

        for (int i = 0; i < getProducts().size(); i++) {
            if (idNumberToBuy.equals(getProducts().get(i).getIdNumber())) {
                addListToBuy(getProducts().get(0));
            }
        }

        StoreMenuView storeMenuView = new StoreMenuView();
        storeMenuView.storeMenu();

    }

}
