package corelab.structurededonnees.lesexceptions.personnalisees;

/***
 * Exemple d'une classe d'exception personnalisée
 */

public class InvalidException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidException(String message) {
        super(message);
    }

}
