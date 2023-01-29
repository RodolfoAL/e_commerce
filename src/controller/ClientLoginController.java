package controller;

import dataBase.ClientDataBase;
import model.Client;
import services.LoggedClientService;
import services.PrintToVerify;
import view.ClientLoginView;
import view.InicialMenuView;

import java.util.List;

public class ClientLoginController {

    private String clientEmail, clientPassword;
    private int index;
    private ClientDataBase clientDataBase;
    private ClientExistanceValidatorController existance = new ClientExistanceValidatorController();
    private ClientEmailValidatorController validation = new ClientEmailValidatorController();
    private InicialMenuView inicialMenu = new InicialMenuView();
    private LoggedClientService loggedClientService = new LoggedClientService();
    private Client loggedClient;

    public void clientEmailValidationController(String clientEmailToValidade, List<Client> clientList) {

        index = existance.validate(clientEmailToValidade, clientList);

        if (index == -2) {
            System.out.println("Não existem clientes cadastrados no site ainda, Entre na loja ou se cadastre antes de logar");
            System.out.println("--------------------------------xx--------------------------------");

            System.out.println();
            inicialMenu.inicializeInicialMenu();
        } else if (index == -1) {
            index = validation.validate(clientEmailToValidade, clientList);

            if (index >= 0) {
                ClientLoginView loginView = new ClientLoginView();
                loginView.receivePasswordToVerify(index);
            } else if (index == -1) {
                System.out.println("Este e-mail não foi cadastrado ainda, Entre na loja ou se cadastre antes de logar");
                System.out.println("--------------------------------xx--------------------------------");
                inicialMenu.inicializeInicialMenu();
            }
        }
    }

    public void clientDataProcessor(int index, String clientPassword) {

        if (clientPassword.equals(clientDataBase.getClientStore().get(index).getPassword())) {
            loggedClientService.setLoggedClient(clientDataBase.getClientStore().get(index));

            PrintToVerify print = new PrintToVerify();
            print.print(index, loggedClientService.getLoggedClient().getEmail(), clientDataBase.getClientStore());


        } else {
            System.out.println("- A senha não confere -");
            inicialMenu.inicializeInicialMenu();
        }
    }

}
