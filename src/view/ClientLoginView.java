package view;

import controller.ClientExistanceValidatorController;
import controller.ClientLoginController;
import dataBase.StoreDataBase;
import interfaces.IReceiveDataFromClient;
import model.Client;

import java.util.List;
import java.util.Scanner;

public class ClientLoginView implements IReceiveDataFromClient {

    private Scanner entrance = new Scanner(System.in);
    private String clientEmail, clientPassword;
    private int index;
    private StoreDataBase storeDataBase;
    public ClientLoginView(StoreDataBase storeDataBase) {
        this.storeDataBase = storeDataBase;
    }

    private ClientLoginController loginController = new ClientLoginController();

    @Override
    public void receiveClientEmailView() {

        System.out.println("---------------------------- LOGAR -------------------------------");
        System.out.println("Digite seu e-mail já cadastrado");
        clientEmail = entrance.nextLine();
        loginController.clientEmailValidationController(clientEmail, storeDataBase.getClientStore());
    }

    public void receiveData() {

    }
}
