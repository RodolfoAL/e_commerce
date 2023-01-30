package view;

import enuns.TypeOfProcucts;

import java.util.Scanner;

public class StoreMenuView {

    private Scanner entrance = new Scanner(System.in);
    private int option;
    private boolean verify = true;
    private ProductTypeMenuView productTypeMenuView = new ProductTypeMenuView();

    public void storeMenu() {

        do {
            try {
                System.out.println("------------------------------ LOJA ------------------------------");
                System.out.println("Qual tipo de produto você deseja? Digite uma opção:");
                TypeOfProcucts type;
                System.out.println("1) " + TypeOfProcucts.ACESSORIO.getDescription()
                        + "\n2) " + TypeOfProcucts.COZINHA.getDescription()
                        + "\n3) " + TypeOfProcucts.JOGO.getDescription()
                        + "\n4) " + TypeOfProcucts.LIVRO.getDescription()
                        + "\n5) " + TypeOfProcucts.VESTUARIO.getDescription());

                option = Integer.parseInt(entrance.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Dados, Miniaturas, Mousepads, etc.\n");
                        verify = false;
                        break;
                    case 2:
                        System.out.println("Canecas, Aventais, Copos, etc.\n");
                        verify = false;
                        break;
                    case 3:
                        System.out.println("Senhor dos Aneis, Zombicide, The Resistance, Coup, etc.\n");
                        verify = false;
                        break;
                    case 4:
                        System.out.println("Dungeons & Dragons, One Ring, Tormenta 20, etc.\n");
                        verify = false;
                        break;
                    case 5:
                        System.out.println("Camisetas, Jaquetas, Moletons, etc.\n");
                        verify = false;
                        break;
                    default:
                        System.out.println("Opção inválida, o correto seria uma das opções numéricas\n");
                        verify = true;
                }

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("A opção correta seria um dos números oferecidos");
                verify = true;
            }
        } while (verify);

        productTypeMenuView.productTypeMenu(option);
    }
}
