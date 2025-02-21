package corelab.structurededonnees.enums.lesenums;

/**
 * Exemple d'un enum ayant :
 * Un champ (label) avec son de getter, lui donnant accès en lecture seule.
 * Un constructeur paramétré obligatoire à cause du champ label : ici chaque constante de notre enum à une propriété "label"
 */

public enum PointsCardinaux {
    NORTH("N"), SOUTH("S"), EST("E"), WEST("O");

    String label;

    PointsCardinaux(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
