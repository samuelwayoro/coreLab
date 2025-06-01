#### 🌟 <font color=red>LES QUEUES :</font>

<b>Structure de données linéaire </b> qui suit généralement le principe de <b>FIFO (First In - First Out) </b> : les 
éléments sont ajoutés à la fin et rétirés du début. Java Fournit plusieurs implémntations de queues dans le framework selon
les besoins (performance,thread-safety,comportement bloquant etc.).

#### 🎯 <font color=red> On utilise une Queue  lorsqu’on veut gérer des éléments dans un ordre contrôlé (souvent FIFO), notamment pour le traitement séquentiel, la communication entre threads ou la gestion de priorités, tout en choisissant l’implémentation adaptée au contexte (concurrent, bloquant, trié, etc.) : </font>

- Traitement séquentiel de tâche : système de tâches à traiter dans l'ordre d'arrivée 


- Communication entre threads (producteur/consommateur) : un thread produit des données un autre les consomme.


- Traitement par priorité : Quand certaines tâches doivent être traitées avant d'autres, selon leurs priorités.- 

- File d'attente dans une interface utilisateur : mise en file de notifications ,messages à afficher,événements.


- Buffer circulaire ou traitements en flux: pour stoker temporairement des données en attente de traitement. 


- Ordonnancement ou planification : Pour gérer des évènements 

#### 📚 <font color=red>INTERFACE PRINCIPALE : </font>  

L'interface principale Queue <E<E>> définit les opérations de base comme :

* add(E e) ou offer(E e) : ajouter un élément 
* remove() ou poll() : retirer et retourner l'élément en tête 
* element() ou peek() : regarder l'élément en tête sans le retirer.

#### 🧪 <font color=red> PRINCIPALES IMPLEMENTATIONS  </font>

<b>1. LinkedList : </b>

* Implémente Queue et Dequeue 
* Non thread-safe.
* Peût être utilisée comme queue FIFO ou pile via Deque.

Exemple : 

        Queue <String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        System.out.PrintLn(queue.remove()); // A

<b>2. PriorityQueue :</b> 

* Les éléments sont triés selon l'ordre naturel ou un Comparator.
* Pas strictement FIFO (car priorité !).
* Non Thread-Safe.

        Queue <Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(5);
        System.out.PrintLn(pq.poll()); //5 (car ordonné du plus petit au plus grand)

<b>3. ArrayDeque </b>

* Implémente Deque (Double-ended queue).
* Plus rapide que LinkedList pour les files ou les piles 
* Non Thread-safe.

#### ⏲ <font color=red> Thread-safe et Concurrentes (java.util.concurrent) </font>

<b>4. ConcurrentLinkedQueue </b> 

* Queue non bloquante, thread-safe, basé sur les listes chaînées . 
* Très utile pour les applications multithread.

<b>5. BlockingQueue </b> (interface)

* Définit une queue bloquante, avec gestion automatique d'attente si la queue est vide (pour take()) ou pleine (pour put())..

#### 📑 <font color=red> Implémentations</font>

* ArrayBlockingQueue
* LinkedBlockingQueue
* PriorityBlockingQueue
* DelayQueue
* SynchronousQueue

Exemple : 

        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.put("Task");
        String task = queue.take(); //bloquant s'il n'ya rien