package corelab.structures_de_donnees.expressionreguliere;

public class ExpressionsRegulieres {

    /**
     \w : équivalent à [a-zA-Z0-9._-]

     \W : équivalent à [^a-zA-Z0-9._-] (tout, sauf [a-zA-Z0-9._-])

     \d : équivalent à [0-9]

     \D : équivalent à [^0-9] (tout, sauf [0-9])

     \s : un séparateur (blanc, tab, ...)

     \S : tout, sauf un séparateur

     + : au moins une fois

     * : un nombre de fois quelconque, y compris 0

     ? : zéro ou une fois

     {2,8} : de deux à huit fois

     {2,} : au moins deux fois

     {,8} : huit fois au maximum
     */


    /**
     * verification de la validitié d'une adresse email
     * @param mot
     * @return
     */
    public static boolean isValidEmail(String mot){
        /**
         * signifie: au mois un caractère ensuite
         * un @ suivi d'au moins un caratère aussi et
         * enfin obligatoirement un .  matérialisé par le (\.) qui siginifi qu'on veux obligatoirement un caractère .
         * suivi d'au minimum deux caractère a la fin d'oû les .. a la fin .
         */
        //String regExp = "^.+@.+\\...+$";

        //le meme patterne amélioré
        //String regExp = "^[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[a-z][a-z]+$";

        //une autre variation du même patterne
        String regExp = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";

         return mot.matches(regExp);
    }

    /**
     * verification de la validitié d'une date
     *
     */
    public static boolean isValidDate(String date){
        /**
         * motif de verification de la date au format :
         * jj/mm/aaaa ou jj/mm/aa
         */
        //String regExp = "^\\d\\d/\\d\\d/\\d\\d(\\d\\d)?$";
        String regExp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)?[0-9]{2}$";


        return date.matches(regExp);
    }
    /**
     * verification de la validitié d'une adresse IPV4  :
     * exemple d'adresse : 127.0.0.1 - 192.168.1.100 - 75.78.10.3
     */
    public static boolean isIpValid(String ip){
        String octet = "[0-9]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5]";
        String regExp = "^((" + octet + ")\\.){3}(" + octet + ")$";
        return ip.matches( regExp );
    }

    public static void main(String[]args){

        /**
         * verif IPV4
         */

        System.out.println(isIpValid("127.0.0.1"));
        System.out.println(isIpValid("192.168.1.100"));
        System.out.println(isIpValid("75.78.10.256"));




        /**
        good emails
         */
        //System.out.println(isValidEmail("samuelwayoro@gmail.com"));
       // System.out.println(isValidEmail("samuel-wayoro@gmail.com"));
       // System.out.println(isValidEmail("samuel_wayoro.blaise@gmail.com"));

        /**
         * bad emails
         */
       // System.out.println(isValidEmail("s@g.c"));
       // System.out.println(isValidEmail("samuelwayoro@gmailcom"));
        //System.out.println(isValidEmail("@@@gmail.@"));

        /**
         * bonne dates

        System.out.println("bonne dates");
        System.out.println(isValidDate("30/05/2017"));
        System.out.println(isValidDate("30/05/17"));
        System.out.println("****************************");
        System.out.println("mauvaises dates");
        System.out.println(isValidDate("30/05/017"));
        System.out.println(isValidDate("30/5/17"));
        System.out.println(isValidDate("3/05/17"));
        System.out.println(isValidDate("45/23/9018"));
         */






    }
}
