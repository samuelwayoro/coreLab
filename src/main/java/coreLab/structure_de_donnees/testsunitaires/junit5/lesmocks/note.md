#### <font color = red>LES MOCKS</font>

#### 1- Qu'est-ce qu'un Mock ? 

Il s'agit d'un objet simulé cherchant à reproduire le comportement d'un objet complexe.
Dans le cas des tests unitaires, ils vont permettre de <font color=red> simuler le comportement des classes qui ne sont
pas la cible de nos tests.</font> Grâce à cette mécanique, on peut continuer à écrire des tests unitaires sans que 
l'exécution d'autres classes ne puisse impacter le code de la classe à tester.

<font color=red>Sans la mécanique des Mocks, nous pouvons également écrire des tests, mais nous les appelons des tests d'intégration.</font>
Ces tests sont utiles également, mais surtout, nous ne rentrons pas dans ces détails dans ce cours.


#### 2- Installation de Mockito 

<font color=gold> a) Dans un projet Maven </font>

* Ajouter les dépendances suivantes dans le fichier POM du projet :
    
        <dependencies>
            <!-- JUnit 5 -->
            <dependency>
                <groupId>org.junit.jupiter</groupId>
                <artifactId>junit-jupiter-api</artifactId>
                <version>5.9.2</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>org.junit.jupiter</groupId>
                <artifactId>junit-jupiter-engine</artifactId>
                <version>5.9.2</version>
                <scope>test</scope>
            </dependency>
        
            <!-- Mockito Core -->
            <dependency>
                <groupId>org.mockito</groupId>
                <artifactId>mockito-core</artifactId>
                <version>5.10.0</version>
                <scope>test</scope>
            </dependency>
        
            <!-- Mockito Inline (pour mocker les classes finales et statiques) -->
            <dependency>
                <groupId>org.mockito</groupId>
                <artifactId>mockito-inline</artifactId>
                <version>5.2.0</version>
                <scope>test</scope>
            </dependency>
        </dependencies>


* Mettre à jour les dépendances 

Soit en rechargeant le projet (Clique droit sur le projet et reload) ou en ligne de commande : 

        mvn clean install 

* Ecrire ses classes de tests avec Mockito
* Exécuter ses classes de tests avec la commande : 
        
        mvn test 

<font color=gold> b) Dans un projet Gradle </font>

* Ajouter les dépendances suivantes dans le fichier build.gradle (dans la section dependencies())

        dependencies {
          // JUnit 5
          testImplementation 'org.junit.jupiter:junit-jupiter-api:5.9.2'
          testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.2'
        
          // Mockito Core
          testImplementation 'org.mockito:mockito-core:5.10.0'
        
          // Mockito Inline (pour mocker les classes finales et statiques)
          testImplementation 'org.mockito:mockito-inline:5.2.0'
      }

<font color=red> NB : </font>  ajouter les dépendances toujours dans le bloc dependencies 
sous ce format si gradle est utilisé avec Kotlin (build.gradle.kts) .

        testImplementation("org.mockito:mockito-core:5.4.0")
        testImplementation("org.mockito:mockito-junit-jupiter:5.4.0")


* Mettre à jour les dépendances : 

Soit en rechargeant le projet (clic droit et reload) ou en ligne de commande : 

        gradle build 

* Écrire ces classes de tests Mock
* Exécuter ses tests avec la commande 
        
        
        gradle test


#### 3- Exemple : Cas pratique de tests

Pour un exemple de définition de Mocks, nous allons apprendre à tester la classe suivante :
<b>ClientDetailsService</b> dépendant d'une autre classe <b> ClientRepository</b>.
Les tests sur ClientDetailsService vont dépendre des résultats de la classe ClientRepository.
<font color=red>L'utilisation des Mocks dans les tests va permettre d'éviter cette dépendance et de rester dans les tests
unitaires.</font>




    public class ClientDetailsService {

        private ClientRepository clientRepository = new ClientRepository();

        public Client getClientDetails(String clientId) throws InvalidClientDetails {
            var client = clientRepository.getClient(clientId);
            if (client.name().isBlank()) {
                throw new InvalidClientDetails("Client name is blank");
            }
            return client;
        }
    }

* <b>DEFINITION DES TESTS UNITAIRES </b>
Voici le code de tests de la classe ClientDetailsService() appelée : <font color=red>ClientDetailsServiceTest()

nb :</font> voir lesmocks/models/ 

    @ExtendWith(MockitoExtension.class)
    class ClientDetailsServiceTest {

        @Mock
        ClientRepository clientRepository;
    
        @InjectMocks
        ClientDetailsService clientDetailsService = new ClientDetailsService();
    
        @BeforeEach
        public void init() {
            MockitoAnnotations.openMocks(this);
        }
    
        @Test
        void getClientDetails_should_return_client() throws InvalidClientDetails {
            var clientId = "PositiveTest";
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


🔥 <font color=red>IMPORTANT</font>

* <font color=red>@ExtendWith(MockitoExtension.class)</font>
Permet d'étendre le fonctionnement de JUnit pour qu'il utilise la librairie Mockito.


* <font color=red>@Mock ClientRepository clientRepository : </font>
Permet de Mocker la classe <b>ClientRepository</b> qui est une dépendance de <b>ClientDetailsService</b>. Cela nous permet 
de forcer le résultat des méthodes du Mock dans les tests pour continuer à faire des tests unitaires, car nous 
ne testons que le code de la classe testée.

* <font color=red>@InjectMocks ClientDetailsService clientDetailsService = new ClientDetailsService();</font>
Permet d'injecter dans <b>ClientDetailsService()</b> les Mocks définis dans la classe de tests. Dans notre cas, il permet
d'utiliser le Mock de <b>ClientRepository</b> dans <b>ClientDetailsService</b>.

* <font color=red>MockitoAnnotations.openMocks(this) : </font> 
Dans le setup des tests, on demande à Mockito d'initialiser les Mocks automatiquement. L'intérêt de le faire dans 
<b>@BeforEach</b> est de repartir sur une nouvelle instance des Mocks à chaque test pour éviter les potentiels effets de bords
entre chaque test.

* <font color=red>Mockito.when()</font> : Permet de définir le comportement des méthodes des Mocks.<b> Ce mécanisme nous permet
donc de ne pas exécuter les méthodes du code de production mais bien un résultat prédéfini de notre Mock.