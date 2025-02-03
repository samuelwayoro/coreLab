package coreLab.structure_de_donnees.testsunitaires.junit5.lesmocks.models;

import java.util.Objects;

public class Client {

    private String clientId;
    private String name;
    private String mail;

    public Client() {
    }

    public Client(String clientId, String name) {
        this.clientId = clientId;
        this.name = name;
    }

    public Client(String clientId, String jean, String mail) {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;
        return Objects.equals(clientId, client.clientId) && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(clientId);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
