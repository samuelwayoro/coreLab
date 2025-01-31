package coreLab.structure_de_donnees.testsunitaires.junit5.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

class MailVerifierTest {

    @Test
    void isMail_should_return_true() {
        var inputMail = "good123@gmail.com";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isTrue();
    }

    @Test
    void isMail_should_return_false_when_at_is_missing() {
        var inputMail = "missinggmail.com";
        var result = MailVerifier.isMail(inputMail);
        assertThat(result).isFalse();
    }
}