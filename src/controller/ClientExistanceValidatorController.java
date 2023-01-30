package controller;

import interfaces.IValidation;
import model.Client;

import java.util.List;

public class ClientExistanceValidatorController implements IValidation {

    private int index = -2;

    @Override
    public int validate(String clientEmail, List<Client> clientList) {
        if(clientList != null) {
            index = -1;
        }
        return index;
    }
}
