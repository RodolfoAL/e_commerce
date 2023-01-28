package controller;

import dataBase.StoreDataBase;
import model.Client;
import view.InicialMenuView;

import java.util.List;

public class ClientLoginController {

    private String clientEmail, clientPassword;
    private int index;
    private StoreDataBase storeDataBase;
    private ClientExistanceValidatorController existance = new ClientExistanceValidatorController();
    private ClientEmailValidatorController registered = new ClientEmailValidatorController();
    private InicialMenuView inicialMenu = new InicialMenuView();

    public void clientEmailValidationController(String clientEmailToValidade, List<Client> clientList) {

        index = existance.validate(clientEmailToValidade, clientList);

        if (index == -2) {
            System.out.println("Não existem clientes cadastrados no site ainda, Entre na loja ou se cadastre antes de logar");
            inicialMenu.inicializeInicialMenu();
        } else if (index == -1) {
            index = registered.validate(clientEmailToValidade, clientList);

            if (index >= 0) {

            } else if (index == -1) {
                System.out.println("Este e-mail não foi cadastrado ainda, Entre na loja ou se cadastre antes de logar");
                inicialMenu.inicializeInicialMenu();
            }

        }

    }
}
