package corelab.structurededonnees.poo.heritage.les_classes_scellees.models;

public sealed class Animal permits Chien, Chat, Oiseau {
    String nom;

    Animal(String nom) {
        this.nom = nom;
    }

    String getNom() {
        return this.nom;
    }
}
