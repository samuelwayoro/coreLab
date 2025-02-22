package corelab.structurededonnees.genericite;

public class TestTraitement {

	public static void main(String[] args) {

		Traitement<Produit> traitement = new Traitement<Produit>(new Produit(1L, "Huile", "un bidon d'huile Lesieur"),
				new Produit(2L, "Miel", "miel de korhogo"));

		//TraitementDeux<Produit> t = new TraitementDeux<Produit>(null)//ne compilera pas car Produit n'implemente pas Cloneable et Serializable
		
		TraitementDeux<ProduitLiquide> t2 = new TraitementDeux<>("test de traitement deux ");
		System.out.println(t2.toString());

	}

}
