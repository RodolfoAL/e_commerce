package view;

import dataBase.ClientDataBase;

import java.util.Scanner;
import static dataBase.ClientDataBase.getClientStore;
import static dataBase.Simulation.simulate;


public class InicialMenuView {
    private Scanner entrance = new Scanner(System.in);
    private int option;
    private boolean verify = true;
    private ClientRegistrationView clientRegistrationView = new ClientRegistrationView();

    public void inicializeInicialMenu() {

        simulate();

        do {
            try {
                System.out.println("Digite a opção desejada: ");
                System.out.println("1) Criar novo cadastro" + "\n2) Fazer login" + "\n3) Entrar na loja e ver produtos");

                option = Integer.parseInt(entrance.nextLine());

                switch (option) {
                    case 1:
                        clientRegistrationView.receiveClientEmailView();
                        verify = false;
                        break;
                    case 2:
                        ClientLoginView clientLoginView = new ClientLoginView();
                        clientLoginView.receiveClientEmailView();
                        verify = false;
                        break;
                    case 3:
                        StoreMenuView storeMenuView = new StoreMenuView();
                        storeMenuView.storeMenu();
                        verify = false;
                        break;
                    default:
                        System.out.println("Opção inválida, o correto seria uma das opções numéricas");
                        verify = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("A opção correta seria um dos números oferecidos");
                verify = true;
            }
        } while (verify);
    }
}
