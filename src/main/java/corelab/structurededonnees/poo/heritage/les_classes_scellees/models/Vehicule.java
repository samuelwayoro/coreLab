package corelab.structures_de_donnees.poo.heritage.les_classes_scellees.models;

public sealed interface Vehicule permits Voitures, Moto {
    void demarrer();
}
