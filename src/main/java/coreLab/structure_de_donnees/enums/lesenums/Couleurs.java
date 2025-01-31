package coreLab.structure_de_donnees.enums.lesenums;

public enum Couleurs {
    VERT("#196F3D"), ROUGE("#E74C3C"), JAUNE("#F7DC6F"), BLEU("#3498DB");

    public String codeHexadecimal;

    Couleurs(String codeHexadecimal) {
        this.codeHexadecimal = codeHexadecimal;
    }

    public String getCodeHexadecimal() {
        return codeHexadecimal;
    }

    //possibilité de rajouter une méthode setter permettant un accès en écriture
    public void setCodeHexadecimal(String codeHexadecimal) {
        this.codeHexadecimal = codeHexadecimal;
    }
}
