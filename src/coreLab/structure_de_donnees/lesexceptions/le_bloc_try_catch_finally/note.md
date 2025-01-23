### LE BLOC TRY/CATCH/FINALLY

Syntax:

        try {
            operation_risquee1;
            operation_risquee2;
        } catch(ExceptionInterressante e) {
            traitement
        } catch(ExceptionParticuliere e) {
            traitement
        } catch(Exception e) {
            traitements
        } finally {
            traitement_pour_terminer_proprement
        }

Le "catch" d'une exception permet d'éviter que celle-ci fasse planter le programme.

<font color=red> ORDRE DES CATCH :</font>
Attention à l'ordre des "catch", les exceptions doivent être catchées dans le bon ordre, de plus spécifique à la plus générale.

En effet, le code suivant 

        public static void main(String[] args){

            var i = 3;
            var j = 0;

            try {
                var division = i/j;
            catch(Exception e){
                ...
            } catch (ArtihmeticException e){
                ...
            }
        }

Lèvera l'exception suivante :

        java: exception java.lang.ArtihmeticException has already been caught.

La raison est que la classe ArithmeticException hérite de la classe Exception, doît être appelée
en premier dans l'ordre des "catch".

- <font color=red>la classe Error : </font>

Elle représente une erreur grave intervenue dans la machine virtuelle Java ou dans un sous système Java. L'application Java s'arrête instantanément dès l'apparition d'une exception de la classe Error.

<font color=gold>NOTE : </font>
Il n'y a pas grand-chose à faire pour empêcher ces erreurs dans le code de nos programmes directement. Ce genre d'erreurs
peut par exemple arriver quand il y a plus de RAM disponible pour faire fonctionner le programme. Ce sont en fait des
erreurs techniques.

- <font color=red>la classe Exception : </font>
  La classe Exception représente à l'inverse des erreurs liées à l'exécution du programme, donc liées au code que l'on développe. La particularité de ces exceptions, c'est qu'elles doivent obligatoirement être gérées dans le code,
  sinon :
    - soit le code ne peut pas compiler On les appelle <font color=red>checked exception.</font>
    - soit le code pourra compiler, mais avec une possibilité d'exceptions dans son execution : on les appelle les <font color=red>unchecked exceptions,
      et la classe RuntimeException en est une. </font> Ce genre d'exception est une classe fille de la classe Exception.

Dans les deux cas, il faut les gérer dans les blocs de code : <font color=red> try / catch() / finally.</font>

<b>Syntax:</b>

        try{
          ...
        } catch(ExceptioName e){
          ...
        } Finally {
          ...
        }

