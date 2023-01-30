package dataBase;

import model.Client;

import static dataBase.ClientDataBase.addClientStore;

public class SimulatedClients {

    public static void simulate() {

        Client admim = new Client("admim@admim.com", "12345678900", "Administrador", "do Sistema", "123");
        addClientStore(admim);
        Client rodolfo = new Client("rodolfo@rodolfo.com", "12345678901", "Rodolfo", "Assis Lisboa", "123");
        addClientStore(rodolfo);
    }
}
