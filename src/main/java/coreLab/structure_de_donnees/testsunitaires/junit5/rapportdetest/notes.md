#### <font color = red>RAPPORTS DE TESTS</font>

#### Les rapports de tests 

Dans un projet java, l'exécution des tests avec les commandes suivantes selon le type du projet 


* Maven 
  
        mvn test 

* Gradle 

        gradle test 

Ces rapports sont par défaut généré dans le repertoire suivant : <b>build/reports/tests</b>
(voir image repertoires_rapport_de_tests.png).

Ce dossier contient un fichier <b>index.xml</b> qui une fois ouvert dans un navigateur montre le rapport de tests dans 
le format très lisible comme celui-ci : (voir fichier image index.png).

Cependant, si vous avez besoin d'automatiser l'exploitation des données des rapports de tests, il est pertinent de se baser
sun un autre format de fichier. Des fichiers <b>XML</b> sont également générés dans le dossier : <b>build/test-results/test</b>
(voir fichier fichier_xml_generes.png).