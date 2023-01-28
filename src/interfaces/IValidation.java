package interfaces;

import model.Client;

import java.util.List;

public interface IValidation {

    int validate(String email, List<Client> list);

}
