package controller;

import model.Client;
import view.ClientRegistrationView;
import view.InicialMenuView;

import java.util.List;
import java.util.Scanner;

import static dataBase.ClientDataBase.getClientStore;
import static dataBase.ClientDataBase.addClientStore;

public class ClientRegistrationController {

    private Scanner entrance = new Scanner(System.in);

    private String newClientEmail, newClientCPF, newClientName, newClientLastName, newClientPassword;
    private int index;

    public void clientEmailCheckerController(String[] newClient) {
        newClientEmail = newClient[0];

        ClientEmailValidatorController clientToRegister = new ClientEmailValidatorController();
        index = clientToRegister.validate(newClientEmail, getClientStore());
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
        addClientStore(clientRegister);

        press(getClientStore());

        InicialMenuView inicialMenuView = new InicialMenuView();
        inicialMenuView.inicializeInicialMenu();

    }

    public void press(List<Client> list) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("O(s) nome(s) cadastrado(s) é(são):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("     " + list.get(i).getName() + " " + list.get(i).getLastName());
        }
        System.out.println("------------------------------------------------------------------");
    }
}
