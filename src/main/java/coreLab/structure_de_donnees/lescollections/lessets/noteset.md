#### <font color=red> LES SETS  </font>

Un Set est une <font color=red>collection d'éléments qui ne contient pas de doublons et qui<b> ne garantit pas l'ordre d'insertion
(selon l'implémentation).</b></font>
<b>Les éléments dans un Set sont uniques, ce qui signifie qu'un même élément ne peut apparaître qu'une seule fois.</b>

##### <font color=red> Principales caractéristiques d'un Set en Java :</font>

🔥 <b> 1. Absence de doublons : </b> 
Aucun élément ne peut être dupliqué. Si tu ajoutes un élément déjà présent, il sera ignoré.

🔥 <b> 2. Pas d'ordre garanti :</b> L'ordre des éléments peut ne pas être celui dans lequel ils ont été ajoutés,
<font color=red>sauf si tu 
utilises une implémentation qui garantit l'ordre (par exemple, LinkedHashSet ou TreeSet).</font>

🔥 <b> 3. Implémentations courantes :</b>

* <font color=red>HashSet : </font> La plus utilisée, basée sur une table de hachage, <b>très rapide pour les opérations 
telles que : add(), remove(), contains()</b>.

* <font color=red>LinkedHashSet: </font> <b>Un set qui préserve l'ordre d'insertion tout en offrant des performances 
similaires à HashSet</b>.

* <font color=red>TreeSet:</font> Un set qui stocke les éléments <b> dans un ordre trié, selon l'ordre naturel des
éléments ou selon un comparateur spécifié</b>.

🎯 <b> A QUOI SERT UN SET ? </b>

🔥 Eviter les doublons dans les collections 

🔥 l'appartenance d'un élément dans une collection efficacement

🔥 Utiliser <font color=red>un ordre trié (TreeSet)</font> ou un <font color=red>ordre d'insertion (avec LinkedHashSet).</font>

En résumé les Set en java sont des structures de données utiles <font color=red> pour stocker des éléments uniques</font>
et sont particulièrement efficaces pour certaines opérations de recherche, d'ajout ou de suppression d'éléments.