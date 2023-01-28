package controller;

import dataBase.StoreDataBase;
import model.Client;
import view.ClientRegistrationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientRegistrationController {

    private Scanner entrance = new Scanner(System.in);
    private String newClientEmail, newClientCPF, newClientName, newClientLastName, newClientPassword;
    private int index;
    private StoreDataBase storeDataBase = new StoreDataBase();
    private List<Client> clientList = new ArrayList<>();

    public void clientEmailCheckerController(String[] newClient) {
        newClientEmail = newClient[0];

        clientList = storeDataBase.getClientStore();
        ClientEmailValidatorController clientToRegister = new ClientEmailValidatorController();
        index = clientToRegister.validate(newClientEmail, clientList);
        ClientRegistrationView register = new ClientRegistrationView();

        if (index != -1) {
            System.out.println("Este e-mail já foi utilizado; \n");
            register.receiveClientEmailView();
        } else {
            register.receiveClientDataView(newClientEmail);
        }
    }

    public void registerClientDataController(String[] newClient) {

        newClientEmail = newClient[0];
        newClientCPF = newClient[1];
        newClientName = newClient[2];
        newClientLastName = newClient[3];
        newClientPassword = newClient[4];

        Client clientRegister = new Client(newClientEmail, newClientCPF, newClientName, newClientLastName, newClientPassword);
        clientList.add(clientRegister);
        storeDataBase.setClientStore(clientList);

        press(storeDataBase.getClientStore());
    }

    public void press(List<Client> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("O nome cadastrado é: " + list.get(i).getName() + " " + list.get(i).getLastName());
        }
    }
}
