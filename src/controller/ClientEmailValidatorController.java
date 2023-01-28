package controller;

import interfaces.IValidation;
import model.Client;

import java.util.List;

public class ClientEmailValidatorController implements IValidation {

    private int index = -1;
    @Override
    public int validate(String ClientEmail, List<Client> clientList) {

        for (int i = 0; i < clientList.size(); i++) {
            if (ClientEmail.equals(clientList.get(i).getEmail())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
