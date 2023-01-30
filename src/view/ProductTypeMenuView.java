package view;

import enuns.TypeOfProcucts;
import model.Product;

import java.util.Scanner;
import static dataBase.StockDataBase.getProducts;

public class ProductTypeMenuView {

    private Scanner entrance = new Scanner(System.in);
    private int count = 1, index;
    private Product product;

    public void productTypeMenu(int option) {

        switch (option) {
            case 1:
                System.out.println("-".repeat(27) + " " + TypeOfProcucts.ACESSORIO + " " + "-".repeat(28));
                break;
            case 2:
                System.out.println("-".repeat(28) + " " + TypeOfProcucts.COZINHA + " " + "-".repeat(29));
                break;
            case 3:
                System.out.println("-".repeat(30) + " " + TypeOfProcucts.JOGO + " " + "-".repeat(30));
                break;
            case 4:
                System.out.println("-".repeat(29) + " " + TypeOfProcucts.LIVRO + " " + "-".repeat(29));
                break;
            case 5:
                System.out.println("-".repeat(26) + " " + TypeOfProcucts.VESTUARIO + " " + "-".repeat(27));
                break;
        }

        System.out.println("Escolha um dos produtos abaixo:");

        for (int i = 0; i < getProducts().size(); i++) {
            System.out.println(count + ") " + getProducts().get(i).getName() + " - preço: R$" + getProducts().get(i).getPrice() +
                    "\n    " + getProducts().get(i).getDescription());
            count++;
        }



    }
}
