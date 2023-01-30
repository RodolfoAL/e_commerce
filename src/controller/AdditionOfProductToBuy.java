package controller;

import view.ProductTypeMenuView;
import view.StoreMenuView;

import static dataBase.StockDataBase.getProducts;
import static services.ShoppingKart.addListToBuy;

public class AdditionOfProductToBuy {

    public void addingToShoppingKart(String idNumberToBuy) {

        for (int i = 0; i < getProducts().size(); i++) {
            if (idNumberToBuy.equals(getProducts().get(i).getIdNumber())) {
                addListToBuy(getProducts().get(0));
            }
        }

        ProductTypeMenuView productTypeMenuView = new ProductTypeMenuView();
        productTypeMenuView.decideStoreOrShoppingKart();
    }

}
