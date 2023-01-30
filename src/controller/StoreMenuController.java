package controller;

import enuns.TypeOfProcucts;
import model.Product;
import services.ShoppingKart;
import view.ShoppingKartView;
import view.StoreMenuView;

import java.util.ArrayList;
import java.util.List;

import static dataBase.StockDataBase.getProducts;

public class StoreMenuController {

    private String typeOfEnuns;

    public List<Product> organizeList(int option) {
        List<Product> productsToSell = new ArrayList<>();
        typeOfEnuns = indexingType(option);

        for (int i = 0; i < getProducts().size(); i++) {

            if (typeOfEnuns.equals(getProducts().get(i).getType().getDescription())) {
                productsToSell.add(getProducts().get(i));
            }
        }
        return productsToSell;
    }
    public String indexingType(int option) {

        switch (option) {
            case 1:
                typeOfEnuns = String.valueOf(TypeOfProcucts.ACESSORIO.getDescription());
                break;
            case 2:
                typeOfEnuns = String.valueOf(TypeOfProcucts.COZINHA.getDescription());
                break;
            case 3:
                typeOfEnuns = String.valueOf(TypeOfProcucts.JOGO.getDescription());
                break;
            case 4:
                typeOfEnuns = String.valueOf(TypeOfProcucts.LIVRO.getDescription());
                break;
            case 5:
                typeOfEnuns = String.valueOf(TypeOfProcucts.VESTUARIO.getDescription());
                break;
        }
        return typeOfEnuns;
    }

    public void addingToShoppingKart(String idNumberToBuy) {

    }


}



