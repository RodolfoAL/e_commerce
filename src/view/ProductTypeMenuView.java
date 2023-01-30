package view;

import controller.AdditionOfProductToBuy;
import controller.StoreMenuController;
import enuns.TypeOfProcucts;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static dataBase.StockDataBase.getProducts;

public class ProductTypeMenuView {

    private Scanner entrance = new Scanner(System.in);
    private int count = 1, index;
    private Product product;
    private boolean verify = true;

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

        System.out.println("Para adicionar ao carrinho de compras, digite o número do produto\nou digite 0 para retornar ao menu inicial:\n");

        StoreMenuController storeMenuController = new StoreMenuController();
        List<Product> productsToSell;
        productsToSell = storeMenuController.organizeList(option);

        for (int i = 0; i < productsToSell.size(); i++) {

            System.out.println(count + ") " + productsToSell.get(i).getName() + " - preço: R$" + productsToSell.get(i).getPrice() +
                    "\n        (" + productsToSell.get(i).getDescription() + ")");
            System.out.println("------------------------------------------------------------------");
            count++;
        }

        do {
            try {
                System.out.println("Digite agora: ");
                option = Integer.parseInt(entrance.nextLine());

                if (option == 0) {
                    verify = false;
                    InicialMenuView inicialMenuView = new InicialMenuView();
                    inicialMenuView.inicializeInicialMenu();
                } else if (option > 0 && option <= productsToSell.size()) {
                    verify = false;
                    System.out.println("Inserir no carrinho de compras o produto: " + productsToSell.get(option - 1).getName() + "\ncom número de identificação: " + productsToSell.get(option - 1).getIdNumber());
                    String idNumberToBuy = productsToSell.get(option - 1).getIdNumber();
                    AdditionOfProductToBuy additionOfProduct = new AdditionOfProductToBuy();
                    additionOfProduct.addingToShoppingKart(idNumberToBuy);
                } else {
                    System.out.println("Dígito inválido, tente novamente");
                    verify = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("A opção correta seria um dos números oferecidos");
                verify = true;
            }
        } while (verify);

    }

    public void decideStoreOrShoppingKart() {


        do {
            try {
                System.out.println("Escolha para onde quer ir:");
                System.out.println("1) Menu inicial \n2) Menu da Loja e continuar comprando \n3) Carrinho de compras");
                int newOption = Integer.parseInt(entrance.nextLine());

                switch (newOption) {
                    case 1:
                        InicialMenuView inicialMenuView = new InicialMenuView();
                        inicialMenuView.inicializeInicialMenu();
                        verify = false;
                        break;
                    case 2:
                        StoreMenuView storeMenuView = new StoreMenuView();
                        storeMenuView.storeMenu();
                        verify = false;
                        break;
                    case 3:
                        ShoppingKartView shoppingKartView = new ShoppingKartView();
                        shoppingKartView.viewListOfProductsToBy();
                        verify = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("A opção correta seria um dos números oferecidos");
                verify = true;
            }
        } while (verify);
    }
}
