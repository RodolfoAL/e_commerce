package controller;

import dataBase.StoreDataBase;
import model.Client;
import services.LoggedClientService;
import services.PrintToVerify;
import view.ClientLoginView;
import view.InicialMenuView;

import java.util.List;

public class ClientLoginController {

    private String clientEmail, clientPassword;
    private int index;
    private StoreDataBase storeDataBase;
    private ClientExistanceValidatorController existance = new ClientExistanceValidatorController();
    private ClientEmailValidatorController validation = new ClientEmailValidatorController();
    private InicialMenuView inicialMenu = new InicialMenuView();
    private LoggedClientService loggedClientService = new LoggedClientService();
    private Client loggedClient;

    public void clientEmailValidationController(String clientEmailToValidade, List<Client> clientList) {

        index = existance.validate(clientEmailToValidade, clientList);

        if (index == -2) {
            System.out.println("Não existem clientes cadastrados no site ainda, Entre na loja ou se cadastre antes de logar");
            inicialMenu.inicializeInicialMenu();
        } else if (index == -1) {
            index = validation.validate(clientEmailToValidade, clientList);

            if (index >= 0) {
                ClientLoginView loginView = new ClientLoginView(storeDataBase);
                loginView.receivePasswordToVerify(index);
            } else if (index == -1) {
                System.out.println("Este e-mail não foi cadastrado ainda, Entre na loja ou se cadastre antes de logar");
                inicialMenu.inicializeInicialMenu();
            }
        }
    }

    public void clientDataProcessor(int index, String clientPassword) {

        if (clientPassword.equals(storeDataBase.getClientStore().get(index).getPassword())) {
            loggedClientService.setLoggedClient(storeDataBase.getClientStore().get(index));

            PrintToVerify print = new PrintToVerify();
            print.press(index, loggedClientService.getLoggedClient().getEmail(), storeDataBase.getClientStore());


        } else {
            System.out.println("- A senha não confere -");
            inicialMenu.inicializeInicialMenu();
        }
    }

}
