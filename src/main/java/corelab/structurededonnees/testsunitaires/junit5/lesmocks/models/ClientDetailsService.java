package corelab.structurededonnees.testsunitaires.junit5.lesmocks.models;

public class ClientDetailsService {

    private ClientRepository clientRepository = new ClientRepository();

    public Client getClientDetails(String clientId) throws InvalidClientDetails {
        var client = clientRepository.getClient(clientId);
        if (client.getName().isBlank()) {
            throw new InvalidClientDetails("Client name is blank");
        }
        return client;
    }

}
