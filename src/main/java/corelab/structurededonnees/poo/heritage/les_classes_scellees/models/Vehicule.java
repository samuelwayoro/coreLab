package corelab.structurededonnees.poo.heritage.les_classes_scellees.models;

public sealed interface Vehicule permits Voitures, Moto {
    void demarrer();
}
