package services;

import model.Client;

import java.util.List;

public class PrintToVerify {


    public void press(int index, String email, List<Client> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("O nome cadastrado é: " + list.get(index).getName() + " " + list.get(index).getLastName());
        }
        System.out.println("O e-mail que está logado é: " + email);
    }
}
