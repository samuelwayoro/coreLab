package coreLab.structure_de_donnees.testsunitaires.junit5.models;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Division par zéro impossible");
        return a / b;
    }
}
