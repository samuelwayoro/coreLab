package coreLab.structure_de_donnees.testsunitaires.junit5.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AdditionTest {

    @Test
    void ajouter_should_return_an_integer() {
        int a = 1;
        int b = 2;
        var result = Addition.ajouter(a, b);
        assertThat(result).isEqualTo(3);
    }
}