#### <font color=red>I/O en JAVA </font>

En java, le concept Input/Output désigne toutes les opérations de <font color=red>lecture (Input)</font> et <font color=red>
d'écriture (output)</font> entre un programme et le monde extérieur. Que ce soit le clavier, l'écran, un fichier, ou même le réseau.

---

🔥 <font color=red> <b> Les bases - Entrée / Sortie standard (console) </b> </font>

- <b>Lecture de l'entrée clavier </b>

On utilise la classe <font color=red>Scanner</font> du package Java.util 

<i> Exemple1 : package sortie standard </i>

    import java.util.Scanner;

    public class Exemple1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // lire depuis le clavier

        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine(); // lit une ligne de texte

        System.out.println("Bonjour, " + nom + " !");
        sc.close(); // bonne pratique : fermer le Scanner
    }
}


👉 Dans ce cas : 
    
- Input : System.in (clavier)
- Output : System.out (console)

---

🔥 <font color=red> <b> Lecture / Ecriture dans un fichier texte : </b> </font>

🧾 <b>LECTURE</b>

<b> Lire un fichier texte signifie :</b> 

- Ouvrir un flux d'entrée (un canal) vers le fichier 
- Lire les caractères ou lignes du fichier 
- traiter les données lues 
- Fermer le flux à la fin (pour libérer les ressources système).

<b> En Java, on utilise souvent </b> 

* <b>FileReader</b> : pour lire caractère par caractère,
* <b>BufferedReader</b> : pour lire ligne par ligne, plus pratique 

💡 <b>Lecture avec BufferReader </B>

<i> Exemple2 : package fichier </i>

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        
        public class LectureFichierTexte {

            public static void main(String[] args) {
            // Le nom du fichier à lire
            String nomFichier = "donnees.txt";

            // try-with-resources : ferme automatiquement le flux après le bloc try
            try (BufferedReader lecteur = new BufferedReader(new FileReader(nomFichier))) {

            String ligne;
            // Lire chaque ligne jusqu'à la fin du fichier (null)
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne); // Affiche la ligne lue
            }

            } catch (IOException e) {
                System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            }
        }

| Ligne                                                                      | Description                                                                                                                             |
| -------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `BufferedReader lecteur = new BufferedReader(new FileReader(nomFichier));` | Ouvre le fichier `donnees.txt` en lecture. `FileReader` lit les caractères, et `BufferedReader` les regroupe en lignes (plus efficace). |
| `while ((ligne = lecteur.readLine()) != null)`                             | Boucle tant qu’il y a des lignes à lire.                                                                                                |
| `System.out.println(ligne);`                                               | Affiche chaque ligne du fichier sur la console.                                                                                         |
| `try (...) { ... }`                                                        | Structure "try-with-resources" : Java ferme automatiquement le fichier à la fin, même en cas d’erreur.                                  |

<i> Exemple3 : Exemple un peu plus avancé - lecture, comptage des lignes et des mots  </i>

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        
        public class LectureFichierStats {
            public static void main(String[] args) {
            String fichier = "texte.txt";
            int nbLignes = 0;
            int nbMots = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    nbLignes++;
                    nbMots += ligne.split("\\s+").length; // découpe la ligne en mots
                }
                System.out.println("Nombre de lignes : " + nbLignes);
                System.out.println("Nombre de mots : " + nbMots);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

👉 Ici, on lit toujours ligne par ligne, mais on ajoute :

- un compteur de lignes,
- un compteur de mots, en utilisant split("\\s+") (qui sépare les mots par des espaces).

💡 <b>Lecture avec FileReader (lecture caractères par caractères) </b>

        import java.io.FileReader;
        import java.io.IOException;
        
        public class LectureCaractere {
            public static void main(String[] args) {
                try (FileReader fr = new FileReader("texte.txt")) {
                    int caractere;
                    while ((caractere = fr.read()) != -1) {
                        System.out.print((char) caractere);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

👉 Ce code lit chaque caractère du fichier un à un.
Moins performant pour les gros fichiers, mais utile pour des traitements fins (par ex. déchiffrage, analyse de syntaxe, etc.).

| Objectif               | Classe utilisée      | Lecture                 | Commentaire    |
| ---------------------- | -------------------- | ----------------------- | -------------- |
| Lire des caractères    | `FileReader`         | caractère par caractère | Bas niveau     |
| Lire des lignes        | `BufferedReader`     | ligne par ligne         | Recommandé     |
| Lecture auto-fermeture | `try-with-resources` | automatique             | Bonne pratique |



🧾 <b> ECRITURE </b>

Ecrire dans un fichier, c'est le contraire de la lecture : 

➡️ Le programme envoie des données (Output) vers un fichier sur le disque.

➡️ Si le fichier n’existe pas, Java peut le créer automatiquement.

➡️ Si le fichier existe déjà, on peut soit le remplacer, soit ajouter du texte à la fin.

Pour cela, Java propose plusieurs classes :

* <b>FileWriter :</b> pour écrire du texte caractère par caractère,

* <b> PrintWriter :</b> pour écrire plus facilement du texte formaté (avec println, print, etc.),

* <b> BufferedWriter :</b> pour améliorer la performance.

💡 <b>Exemple : Ecrire dans un fichier avec PrintWriter : EcrireAvecPrinter.class</b>

💡 <b>Exemple : Ecrire dans un fichier avec BufferedWriter : EcrireAvecBuffered.class</b> 
        
- Avec BufferWriter, l'écriture se fait sans saut de ligne alors, on utilise .newLine() 
- BufferWriter est plus rapide PrintWriter pour les grandes quantités de texte.


