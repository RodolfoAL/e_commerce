package dataBase;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class StoreDataBase {

    private List<Client> clientStore = new ArrayList<>();

    public List<Client> getClientStore() {
        return clientStore;
    }

    public void setClientStore(List<Client> clientStore) {
        this.clientStore = clientStore;
    }
}
