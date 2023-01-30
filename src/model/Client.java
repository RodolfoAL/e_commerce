package model;

public class Client {

    private String email;
    private String CPF;
    private String name;
    private String lastName;
    private String password;
    private String address;

    public Client(String email, String CPF, String name, String lastName, String password) {
        this.email = email;
        this.CPF = CPF;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


