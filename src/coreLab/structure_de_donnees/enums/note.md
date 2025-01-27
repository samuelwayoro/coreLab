### LES ENUMERATIONS

Les énumérations sont un outil puissant en java qui permet
de <font color=red> représenter un ensemble de constantes prédéfinies, souvent utilisés
pour limiter les valeurs possibles d'une variable </font>. Cela rend le code plus clair et plus facile
à maintenir.

<font color=red> <b>DEFINITION </b></font>

<b>Une énumération ou (enum) </b> est une classe spéciale en java qui regroupe
des constantes, généralement utilisées pour représenter un ensemble de valeurs fixes
et connues.

<b>EXEMPLE : </b> les jours de la semaine, les 4 points cardinaux, les états d'un procéssus,
des couleurs…

<b><font color=red>SYNTAX</font></b>

    public enum Jour {
        LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI,SAMEDI,DIMANCHE
    }

<b><font color=red>UTILISATION</font></b>

Une fois que l'énumération est définie, vous pouvez l'utiliser comme un type de données
dans votre programme.

<b>EXEMPLE : </b>

    public class ExempleEnum {
            public static void main(String[] args){

            Jour today = Jour.LUNDI;

            //affiche : Aujourd'hui est : LUNDI
            System.out.printLn("Aujourd'hui est : "+today);

            //pareil avec la méthod .toString() 
            System.out.printLn(today.LUNDI.toString());

            //Comparaison (ici est true)
            if(today == Jour.LUNDI){
                System.out.printLn("C'est le début de la semaine !");
            }

            //Boucle sur toutes les valeurs 
            // affiche toutes les valeurs constantes de l'enum Jours
            for(Jour jour : Jour.values()){
                System.out.printLn(jour); 
            }
        }
    }

<b><font color=red>CARACTERISTIQUES PRINCIPALES</font></b>

* <font color=red>La méthode values() : </font>

Retourne un tableau contenant toutes les constantes de l'énumération.

    Jour[] jours = Jours.values();
    for(Jour jour : jours){
        system.out.println(jour); //affiche LUNDI,MARDI....DIMANCHE
    }

* <font color =red>La méthode ordinal() : </font>

Retourne la position (index) de l'élément dans l'énumération (commençant à 0).

    system.out.println(Jour.LUNDI.ordinal());

* <font color =red>La méthode name() :</font>

Retourne le nom exact de la constante en tant que chaine de caractères.

    system.out.println(Jour.LUNDI.name());

🔥 <font color=gold>AJOUTE DE FONCTIONNALITES</font>

Les énumérations peuvent conténir :

- des champs
- des constructeurs
- des méthodes

<font color =red>Exemple : </font>

    public enum Couleur {

        ROUGE("#FF0000"),
        VERT("#00FF00"),
        BLEU("#0000FF");

        //champs rajouté
        private String codeHexa;

        //constructeurs paramétré du fait du champs
        Couleur(String codeHexa) {
            this.codeHexa = codeHexa;
        }

        //méthode permettant de recup la valeur du champ
        public String getCodeHexa(){
            return codeHexa;
        }
    }

    public class Test {
        public static void main(String [] args){
            system.out.println("code couleur rouge :"+Couleur.ROUGE.getCodeHexa());
        }
    }


🚀<font color =red>AVANTAGES </font>

- <font color =red>Lisibilité : </font> Remplace des constantes basées sur des chaînes ou des entiers.
- <font color =red>Sécurité : </font> Limites les valeurs possibles à celles définies dans l'énumération.
- <font color =red>Flexibilité : </font> Permet d'ajouter des méthodes et des champs pour enrichir les comportements.

🚀<font color =red>LIMITATIONS</font>

- Une énumération ne peut jamais hériter d'une autre classe parce qu'elle hérite implicitement de la classe : 
<b>java.lang.Enum</b>
- Cépendant, elle peut implémenter des interfaces.

