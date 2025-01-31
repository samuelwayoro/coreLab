package coreLab.structure_de_donnees.poo.heritage.les_classes_scellees.models;

import coreLab.structure_de_donnees.lescollections.Voiture;

public sealed interface Vehicule permits Voitures, Moto {
    void demarrer();
}
