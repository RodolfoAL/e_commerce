package view;

import controller.ClientExistanceValidatorController;
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
    private ClientLoginView(StoreDataBase storeDataBase) {
        this.storeDataBase = storeDataBase;
    }

    ClientExistanceValidatorController existance = new ClientExistanceValidatorController();

    @Override
    public void receiveClientEmailView() {

        System.out.println("---------------------------- LOGAR -------------------------------");
        System.out.println("Digite seu e-mail já cadastrado");
        clientEmail = entrance.nextLine();
        index = existance.validate(clientEmail, storeDataBase.getClientStore());

    }
}
