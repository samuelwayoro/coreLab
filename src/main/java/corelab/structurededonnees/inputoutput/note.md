#### <font color=red>I/O en JAVA </font>

En java, le concept Input/Output désigne toutes les opérations de <font color=red>lecture (Input)</font> et <font color=red>
d'écriture (output)</font> entre un programme et le monde extérieur. Que ce soit le clavier, l'écran, un fichier, ou même le réseau.

🌞 RAPPEL : 

En anglais, “stream” veut dire “courant” ou “flux”.
Dans Java, un Stream représente un flux de données qui circule entre ton programme et une source ou une destination.

🔹 Ce flux peut aller dans les deux sens :

| Type de flux     | Direction                        | Rôle                |
| ---------------- | -------------------------------- | ------------------- |
| **InputStream**  | De l’extérieur vers le programme | Lecture de données  |
| **OutputStream** | Du programme vers l’extérieur    | Écriture de données |

🔹 Quelques classes importantes avec “Stream”

Voici un petit tour d’horizon :

| Classe                                         | Type                     | Description                                                  |
| ---------------------------------------------- | ------------------------ | ------------------------------------------------------------ |
| `FileInputStream`                              | Entrée binaire           | Lire un fichier non textuel (image, audio, etc.)             |
| `FileOutputStream`                             | Sortie binaire           | Écrire dans un fichier binaire                               |
| `BufferedInputStream` / `BufferedOutputStream` | Entrée / sortie binaire  | Ajoute un tampon (buffer) pour accélérer la lecture/écriture |
| `ObjectInputStream` / `ObjectOutputStream`     | Entrée / sortie d’objets | Lire ou écrire des objets Java entiers                       |
| `InputStreamReader` / `OutputStreamWriter`     | Adaptateurs              | Convertissent un flux binaire ↔️ flux texte                  |

Les flux se connectent entre eux (enchaînement)

💡 En Java, tu peux combiner plusieurs flux pour ajouter des fonctionnalités.

Exemple :

        ObjectOutputStream out =
            new ObjectOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream("data.dat")
                )
            );

👉 Ici :

- FileOutputStream :<font color=red> écrit dans le fichier,</font>

- BufferedOutputStream : <font color=red> ajoute un tampon (meilleure performance),</font>

- ObjectOutputStream : <font color=red> permet d’écrire des objets Java.</font>

C’est un peu comme empiler des “tuyaux” les uns sur les autres pour ajouter des filtres ou des fonctions supplémentaires.

🧠 En résumé

| Mot-clé             | Signification               | Rôle                                                           |
| ------------------- | --------------------------- | -------------------------------------------------------------- |
| **Stream**          | Flux (données en mouvement) | Canal entre le programme et un support (fichier, réseau, etc.) |
| **InputStream**     | Flux entrant                | Lecture de données                                             |
| **OutputStream**    | Flux sortant                | Écriture de données                                            |
| **Reader / Writer** | Flux de caractères          | Lecture / écriture de texte                                    |
| **Buffered**        | Tampon mémoire              | Accélère le traitement                                         |
| **Object**          | Sérialisation               | Sauvegarde / lecture d’objets Java                             |


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

---

🔥 <font color=red> <b> Lecture / Ecriture binaire  </b> </font>

▶ <b>Principe </b>

Les fichiers binaires ne contiennent pas de texte lisible, mais des octets (0 et 1).
Exemple : images, fichiers PDF, fichiers audios, fichiers exécutables.

En Java, on utilise des flux d'octets : 
* <b>InputStream pour lire 
* OutputStream pour écrire </b>

Les classes de base : 
* <b> FileInputStream : lecture binaire dans un fichier 
* FileOutPutStream : écriture binaire dans un fichier.</b>

<b><font color=green>Exemple : CopieBiniare.class</font></b>

💡<b>Pour de grands fichiers, on doit lire par blocs d'octets exemple : 1024 Octets pour être plus rapide : </b>

<b><font color=green>Exemple : CopieBiniare.class - méthode largeCopy() </font></b>

---
🔥 <font color=red> <b> Lecture / Ecriture d'objets (sérialisation / déserialisation)  </b> </font>

🟥 <b> Principe</b> 

Ici, on veut sauvegarder un objet java dans un fichier (exemple : l'instance d'une classe), et pouvoir le relire plus 
tard avec toutes ses données. 

Java offre pour cela :

* <b>ObjectOutputStream</b> : pour écrire des objets 
* <b>ObjectInputStream</b> : pour lire des objets. 

⚠️ <b><font color=red> Mais attention pour celà l'objet doit être sérialisable, c'est-à-dire qu'il implémente 
l'interface Serializable.</font></b>

<b><font color = green> Exemple : 

 * Ecriture : voir class ExempleEcritureObjet dans le package serialisation 
 * Lecture : voir class ExempleLectureObjet dans le package serialisation </font></b>

---
