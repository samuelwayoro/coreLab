package coreLab.structure_de_donnees.programmationfonctionnelle.lesstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemple1 {

	public static void main(String[] args) {
		//retourner une liste ordonnée de nombre pairs unique (non dupliqué) , multiplié par 3
		
		List<Integer> numbers = Arrays.asList(3,1,4,1,5,9,2,6,5,3);
		
		List<Integer> result = numbers
								.stream()//creation du stream
								.filter(n->n%2==0)//filtre pour obtenir les nbres pairs
								.map(n->n*3)//multiplication de chaque nbre pair obtenu par 3
								.sorted()//trie croissant des resultat de la multiplication
								.distinct()//suppression de possible doublons 
								.collect(Collectors.toList());//operation terminale : recup dans une liste
		
		System.out.println("résultat final : "+result);
		
		/***
		 * UTILISATION DE PARALLELSTREAM a utiliser avec parcimonie car :
		 * *Ordre : l'odre de traitement des éléments peut ne pas être préservé avec parallelStream().
		 * *Coût : la parallélisation à un coût en termes de gestion des threads et peut ne pas être
		 *  avantageuse pour de petites quantités de données ou des opérations simples.
		 * 
		 */
		
		//retourner le resultat de la somme de nombres pairs de cette liste 
		List<Integer> nombres = Arrays.asList(1,2,3,4,5,6);
		int somme = nombres.parallelStream().filter(n->n%2==0).reduce(0,(a,b)->a+b);
		System.out.println("resultat de la somme  "+somme);//retourne 12 car : 2+4+6 =12
	}

}
