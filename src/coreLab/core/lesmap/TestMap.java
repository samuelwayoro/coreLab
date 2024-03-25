package coreLab.core.lesmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {

		testMap();
		
	}
	
	static void testMap() {
		/**
		 * Une Map est une structure de données de données de type Table de hachage.
		 * Une table de hachage est une structure de données qui stockent ses données en associant chaque clé à une valeur
		 * clé -> valeur.
		 * exemple : Map<TypeDeClé,TypeDeLaDonnée> map = new HashMap<>();
		 * les opérations courantes qu'on peux faire avec un Map sont :
		 * 
		 *  -> AJOUTER : map.put(clé,valeur)
		 *  
		 *  -> RETIRER si la paire clé/valeur existe : map.remove(clé,valeur) 
		 *  
		 *  -> REMPLACER la valeur si la clé existe bel et bien : map.replace(clé,valeur) 
		 *  
		 *  -> CARDINAL (copie d'un map dans une autre) : map.putAll(otherMap);
		 *  
		 *  -> EFFACER : map.clear()
		 *  
		 *  -> ITERER (boucler/parcourir) :utiliser la méthode nomMap.KeySet()/nomMap.values() afin de parcourir  
		 *  
		 *  -> TESTER (vérifier si un objet y est à partir de sa clé ) : map.contains(clé) qui retourne true ou false
		 */
		
		//exemple d'une map de clé integer et de valeur string 
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(75, "Paris");//rajoute un données paire/clé valeur dans la map grâce à la méthode put()
		map.put(50, "Manche");
		map.put(59, "Nord");
		map.put(33, "Gironde");
		map.put(83, "Var");
		map.putIfAbsent(92, "Haut de Seine");//ajout si : la clé est associée a une valeur "null" ou si la clé est absente.
		//map.replace(clé, "valeur") // 
		//map.remove(cclé,valeur) //retire
		
		//recuperation d'une valeur toujours à partir de son index
		map.get(33);//retourne "Gironde"
		
		//System.out.println(map.get(100)); //retourne null car l'index 100 n'existe pas 
		
		/***
		 * ITERATION DE MAP : 
		 * on ne parcours pas les map comme les set ou les list ... 
		 * les map sont un ensemble de deux collections : collection de clé associée une collection de valeurs.
		 * Alors pour le parcours il faut : 
		 * 	- soit  recuperer la collection des clés ou des valeur pour une itération ... 
		 */
		
		Set<Integer> keySet = map.keySet();
		Collection<String> values = map.values();
		
		/***
		 * soit recuperer un : Set<Map.Entry<Clé,Valeur>> mapEntries à partir de la méthode nomMap.entrySet();
		 * 
		 */
		Set<Map.Entry<Integer, String>> mapEntries = map.entrySet();
		mapEntries.forEach(x->System.out.println(x)); //affichera clé=valeur
		
	}

}
