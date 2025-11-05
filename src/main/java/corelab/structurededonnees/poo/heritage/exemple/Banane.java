package corelab.structures_de_donnees.poo.heritage.exemple;

public class Banane extends Fruit {

    public Banane(String nom, String couleur, String origine) {
        super(nom, couleur, origine);
    }

    @Override
    public String descriptionFruit() {
        return super.descriptionFruit() + " : précisement une Banane";
    }
}
