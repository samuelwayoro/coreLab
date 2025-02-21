package corelab.structurededonnees.poo.heritage.exemple;

public class Main {
    public static void main(String[] args) {

        //utilisation d'une classe fille Banane

        Fruit fruit = new Banane("banane cavendish","jaune","Inde");

        System.out.println(fruit.toString());

        System.out.println(fruit.descriptionFruit());
    }
}
