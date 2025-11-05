package corelab.structures_de_donnees.testsunitaires.junit5.models;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Classe de test unitaires de la classe MailVerifier.
 * Elle contient un ensemble de tests de tous les
 * scénarios possibles de la méthode static isMail
 */

class MailVerifierTest {


    /**
     * Rajout des méthodes "setup" beforAll() et beforEach() :
     * ensemble de méthodes s'exécutant avant les méthodes de test.
     */

    @BeforeAll
    static void beforAll() {
        System.out.println("*** Avant tout les test ***");
    }

    @BeforeEach
    void beforEach() {

        System.out.println("--- Avant chaque tests ---");
    }

    /**
     * Rajout des méthodes "tearDown" afterAll() et afterEach() :
     * ensemble de méthodes s'exécutant après exécution des tests
     */

    @AfterAll
    static void afterAll() {
        System.out.println("+++ Après tout les tests +++ ");
    }

    @AfterEach
    void afterEach() {
        System.out.println("/// après chaque tests ///");
    }


    @Test
    void isMail_should_return_true() {
        var inputMail = "good123@gmail.com";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isTrue();
    }

    @Test
    void isMail_should_return_false_when_at_is_missing() {
        var inputMail = "missingAtgmail.com";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isFalse();
    }

    @Test
    void isMail_should_return_false_when_domain_is_missing() {
        var inputMail = "missingDomain@.com";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isFalse();
    }

    @Test
    void isMail_should_return_false_when_point_is_missing() {
        var inputMail = "missingDot@com";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isFalse();
    }

    @Test
    void isMail_should_return_false_when_extension_is_missing() {
        var inputMail = "missingExtension@.";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isFalse();
    }

    @Test
    void isMail_should_return_false_when_mailDomain_contains_digits() {
        var inputMail = "missing@gmail123.com";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isFalse();
    }
}