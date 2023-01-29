package view;

import controller.ClientLoginController;
import dataBase.ClientDataBase;
import interfaces.IReceiveDataFromClient;

import java.util.Scanner;
import static dataBase.ClientDataBase.getClientStore;

public class ClientLoginView implements IReceiveDataFromClient {

    private Scanner entrance = new Scanner(System.in);
    private String clientEmail, clientPassword;
    private int index;


    @Override
    public void receiveClientEmailView() {

        System.out.println("---------------------------- LOGAR -------------------------------");
        System.out.println("Digite seu e-mail já cadastrado:");
        clientEmail = entrance.nextLine();
        ClientLoginController loginController = new ClientLoginController();
        loginController.clientEmailValidationController(clientEmail, getClientStore());
    }

    public void receivePasswordToVerify(int index) {
        System.out.println("Agora digite sua senha correspondente:");
        clientPassword = entrance.nextLine();
        ClientLoginController loginController = new ClientLoginController();
        loginController.clientDataProcessor(index, clientPassword);

    }
}
