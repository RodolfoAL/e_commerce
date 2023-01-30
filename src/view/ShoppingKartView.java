package view;

import static services.ShoppingKart.getListToBuy;
public class ShoppingKartView {

    public void viewListOfProductsToBy() {

            System.out.println("Sua lista de compras é:");
        for (int i = 0; i< getListToBuy().size(); i++) {
            System.out.println(getListToBuy().get(i).getName());
        }
    }
}
