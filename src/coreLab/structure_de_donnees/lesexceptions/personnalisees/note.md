### LES EXCEPTIONS PERSONNALISEES

On peut donner le choix d'avoir un message d'erreur ou non dans l'Exception en définissant deux constructeurs différents :

<b>Syntax</b>

    public class SaisieErroneeException extends Exception {
        
        public SaisieErroneeException(){
        }

        public SaisieErroneeException(String s){
            Super(s);
        }
    }

Il est préférable d'étendre Exception dans ces implémentations personnalisées pour être sûrs d'avoir des checked exceptions.

Par convention, on met le mot Exception dans le nom d'une exception personnalisée.

        public class ExceptionNameException {
            ...
        }

