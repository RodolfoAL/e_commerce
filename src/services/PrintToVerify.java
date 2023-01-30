package services;

import model.Client;

import java.util.List;
import static dataBase.ClientDataBase.getClientStore;

public class PrintToVerify {

    public void print(int index, String email, List<Client> list) {
        System.out.println("------------------------------------------------------------------");
            System.out.println("O cliente logado é: " + list.get(index).getName() + " " + list.get(index).getLastName());

        System.out.println("------------------------------------------------------------------");
        System.out.println("O e-mail que está logado é: " + email);
        System.out.println("------------------------------------------------------------------");
        System.out.println("O(s) cliente(s) cadastrado(s) é(são):");
        for (int i = 0; i < getClientStore().size(); i++) {
            System.out.println("  " + getClientStore().get(i).getName());
        }
        System.out.println("------------------------------------------------------------------");
    }
}
