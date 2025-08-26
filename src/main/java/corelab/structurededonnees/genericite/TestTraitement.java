package corelab.structurededonnees.genericite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestTraitement {

    private static final Logger log = LogManager.getLogger(TestTraitement.class);

    public static void main(String[] args) {


        Traitement<Produit> traitement = new Traitement<Produit>(new Produit(1L, "Huile", "un bidon d'huile Lesieur"),
                new Produit(2L, "Miel", "miel de korhogo"));

        //TraitementDeux<Produit> t = new TraitementDeux<Produit>(null)//ne compilera pas car Produit n'implemente pas Cloneable et Serializable

        //creation de l'objet de type ProduitLiquide
        ProduitLiquide pl = new ProduitLiquide(1L, "Huile Dinor", "Huilde produite en Côte d'Ivoire", 12.5);

        TraitementDeux<ProduitLiquide> traitementDeux = new TraitementDeux<>(pl);

        log.info("affichage de traitementDeux {}", traitementDeux);

    }

}
