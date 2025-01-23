### L'INSTRUCTION THROW ET THROWS 

<font color=red><b> throw </b></font> : utilisé dans le corps de méthode

Pour générer une Exception (personnalisée ou non d'ailleurs), on utilise le mot clé throw : 

🔥 Syntax:

    var scanner = new Scanner(System.in);
    var saisie = scanner.nextLine();
    if(saisie.length() == 0) {
        throw new SaisieErronneeException("La saisie utilisateur ne doit pas être vide");
    }

<font color=red><b> throws </b></font> : utilisé dans la signature des méthodes

Quand une méthode lève une exception, il est obligatoire d'ajouter le mot clé <font color=red>throws</font>
dans la signature de la méthode.

🔥 Syntax :

    public static void main(String[] args) throws SaisieErronneeException {
        ...
    }
