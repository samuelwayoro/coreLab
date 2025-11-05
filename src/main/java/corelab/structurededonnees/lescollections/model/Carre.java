package corelab.structures_de_donnees.lescollections.model;

public class Carre implements Comparable {
    private int cote;

    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    public Carre(int cote) {
        this.cote = cote;
    }

    public Carre() {
    }

    @Override
    public int compareTo(Object o) {//implementation de l'interface comparable , avec une logique de comparaison
        /**
         * tjrs transtiper l'objet recuperer pour en faire un objet comparable
         */
        Carre autreCarre = (Carre) o;
        //retourner -1 si le carre passé en param est sup au carre courant
        if(cote < autreCarre.cote) return -1;
        //retourner 0 si egalité de coté
        if(cote == autreCarre.cote) return 0;
        //sinon retourner 1 , si coté du carré courant est sup à celui passé en param
        return 1;
    }

}
