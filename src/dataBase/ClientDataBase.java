package dataBase;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDataBase {

    private static ClientDataBase dataBase = new ClientDataBase();

    public ClientDataBase() {
        this.clientStore = new ArrayList<>();
    }

    private  List<Client> clientStore;

    public static List<Client> getClientStore() {
        return dataBase.clientStore;
    }

    public static void setClientStore(List<Client> clientStore) {
        dataBase.clientStore = clientStore;
    }
}
