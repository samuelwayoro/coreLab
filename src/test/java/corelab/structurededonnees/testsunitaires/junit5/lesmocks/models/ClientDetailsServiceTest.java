package corelab.structures_de_donnees.testsunitaires.junit5.lesmocks.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClientDetailsServiceTest {

    @Mock
    ClientRepository clientRepository;

    @InjectMocks
    ClientDetailsService clientDetailsService = new ClientDetailsService();

    @BeforeEach
    void setUp() {
        System.setProperty("org.mockito.plugins.MockMaker", "mock-maker-inline");
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getClientDetails_should_return_client() throws InvalidClientDetails {
        var clientId = "Positivetest";
        var client = new Client(clientId, "Jean", "jean@gmail.com");
        Mockito.when(clientRepository.getClient(clientId)).thenReturn(client);
        var result = clientDetailsService.getClientDetails(clientId);
        assertThat(result).isEqualTo(client);
    }


    @Test
    void getClientDetails_should_throw_exception_when_client_name_is_blank() {
        var clientId = "blankNameTest";
        var client = new Client(clientId, "", "jean@gmail.com");
        Mockito.when(clientRepository.getClient(clientId)).thenReturn(client);
        assertThatThrownBy(() -> {
            clientDetailsService.getClientDetails(clientId);
        }).isInstanceOf(InvalidClientDetails.class)
                .hasMessage("Client name is blank");
    }
}