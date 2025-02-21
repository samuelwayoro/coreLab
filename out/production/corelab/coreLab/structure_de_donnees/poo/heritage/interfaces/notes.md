#### <font color=red>LES INTERFACES EN JAVA </font>

<b>Une interface est une structure entièrement abstraite qui définit un contrat que les classes doivent respecter. 
<font color=red>Contrairement aux classes abstraites, une classe peut implémenter de plusieurs interfaces </font>.</b>
Depuis java 8 les interfaces peuvent contenir des méthodes d'implémentations complètes : <font color=red> ce sont les méthodes 
statiques (static); ou les méthodes par défaut (default)</font>.

🎯 <font color=red><b> Pourquoi utiliser une Interface ? </b></font>

✅ <b>Permet l'héritage multiple</b> (une classe peut implémenter plusieurs interfaces).

✅ <b>Encourage la programmation Orientée Interface (POI) pour découper le code.</b>

✅ <b> Facilite la maintenabilité et l'extensibilité du code.</b>

✅ <b> Définit un contrat que toutes les classes implémentant l'interface doivent respecter.</b>


ℹ Exemple : voir classe Demo.java


🚀 <font color=red><b> Quand utiliser une interface ? </b></font>

* <b> Si tu veux un contrat sans implémentation forcée (chaque classe aura son implémentation des méthodes de l'interface).


* Si tu veux permettre une architecture modulaire et flexible (héritage multiple).


* Si tu travailles avec des API et du polymorphisme. </b>

🔥 <font color=red><b> DEPUIS JAVA 8 : Méthodes "default" et "static" </b></font>

Avant java 8 les interfaces ne contenaient que des méthodes abstraites. Maintenant, elles peuvent inclure des méthodes 
par défaut (default) et des méthodes statiques.

ℹ exemple : voir fichier Demo.java

### 😵 <font color=red>Différences entre une Interface et une classe abstraite</font>


| ASPECT       | INTERFACE                                                                         | Classe Abstraite                                            | 
|--------------|-----------------------------------------------------------------------------------|-------------------------------------------------------------|
| HERITAGE     | Une classe peut implémenter plusieurs interfaces                                  | Une classe ne peut hériter que d'une seule classe abstraite | 
| CONTENU      | Définit des méthodes abstraites , et depuis jdk8 des méthodes complètes (default) | peut contenir des méthodes abstraites et concrètes          |   
| CHAMPS       | Seulement des constantes <b>(final static)</b>                                    | Peut contenir des attributs avec état                       |   
| CONSTRUCTEUR | ❌ NON                                                                             | ✅ OUI                                                       |   
| UTILISATION  | Quand plusieurs classes doivent partager un comportement commun sans état         | Quand une classe doit partager du code commun               |   


<font color=red> NB </font> 

* <b>Utilise une interface si tu veux définir un comportement sans état
* Utilise une classe abstraite si tu veux partager des méthodes et attributs communs. </b>


