package view;

import java.util.Scanner;

public class InicialMenuView {
    private Scanner entrance = new Scanner(System.in);
    private int option;
    private boolean verify = true;

    public void inicializeInicialMenu() {


        do {
            try {
                System.out.println("Digite a opção desejada: ");
                System.out.println("1) Criar novo cadastro" + "\n2) Fazer login" + "\n3) Entrar na loja e ver produtos");

                option = Integer.parseInt(entrance.nextLine());

                switch (option) {
                    case 1:
                        ClientRegistrationView clientRegistrationView = new ClientRegistrationView();
                        clientRegistrationView.reciveClientEmailView();
                        verify = false;
                        break;
                    case 2:
                        System.out.println("Fazer login");
                        verify = false;
                        break;
                    case 3:
                        System.out.println("Maravilhe-se!");
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
