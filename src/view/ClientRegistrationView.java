package view;

import controller.ClientRegistrationController;
import interfaces.IReceiveDataFromClient;

import java.util.Scanner;

public class ClientRegistrationView implements IReceiveDataFromClient {

    private Scanner entrance = new Scanner(System.in);
    private String clientEmail, clientCPF, clientName, clientLastName, clientPassword;
    private int index;

    private ClientRegistrationController clientRegistration = new ClientRegistrationController();

    @Override
    public void receiveClientEmailView() {

        System.out.println("-------------------------- REGISTRAR -----------------------------");
        System.out.println("Digite um e-mail válido");
        clientEmail = entrance.nextLine();
        String[] newClient = new String[5];
        newClient[0] = clientEmail;

        clientRegistration.clientEmailCheckerController(newClient);
    }

    public void receiveClientDataView(String email) {

        clientEmail = email;
        System.out.println("Digite seu CPF:");
        clientCPF = entrance.nextLine();
        System.out.println("Digite seu primeiro nome:");
        clientName = entrance.nextLine();
        System.out.println("Por favor, agora digite seu sobrenome:");
        clientLastName = entrance.nextLine();
        System.out.println("Digite uma senha:");
        clientPassword = entrance.nextLine();

        String[] newClient = new String[5];
        newClient[0] = clientEmail;
        newClient[1] = clientCPF;
        newClient[2] = clientName;
        newClient[3] = clientLastName;
        newClient[4] = clientPassword;

        clientRegistration.registerClientDataController(newClient);
    }

}
