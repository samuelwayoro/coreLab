package coreLab.structure_de_donnees.poo.heritage.les_classes_scellees.models;

public sealed class Chat extends Animal permits Siamois {
    Chat(String nom) {
        super(nom);
    }
}
