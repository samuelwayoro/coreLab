Un stream en java est une suite d'éléments , une sequence d'élément sur lesquels des opérations de calcul peuvent
être effectués en parallèle ou séquentiellement . 

Un stream se compose d'opérations intermédiaires et d'opérations terminales . 

Les opérations intermédiaires prennent en entrée un stream et renvoie un stream .
**EXEMPLE : filter , map , sorted , distinct.

les opérations terminales produisent un résultat ou un "side-effect" 
**EXEMPLE : collect , forEach , reduce.

la syntaxe est : 
	var variable = collectionObject.stream()
									.operationInt1(lambdaOuMethodeDeReference())
									.operationInt2(lambdaOuMethodeDeReference())
									.operationInt3(lambdaOuMethodeDeReference())
									.operationTerminale(Classe.methodeDeRetour());
