package services;

import model.Client;

public class LoggedClientService {

    private Client loggedClient;

    public Client getLoggedClient() {
        return loggedClient;
    }

    public void setLoggedClient(Client loggedClient) {
        this.loggedClient = loggedClient;
    }

}
