package corelab.structurededonnees.date;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        /*
         * Utilisation de la classe Date
         *
         */
        System.out.println("avec la classe Date : ");
        Date date = new Date();

        System.out.println(date);


        /*
         * Utilisation de la classe Calendar pour afficher la date
         */
        System.out.println("avec la classe Calendar : ");
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());


        /*
            utilisation de la classe Instant
         */
        System.out.println("utilisation de la classe Instant : ");
        Instant instant = Instant.EPOCH; //représente 1970-01-01T00:00:00Z
        System.out.println(instant);

        //affichage de la date actuelle
        System.out.println(Instant.now());

        /**
         * Utilisation de la classe LocalDate
         */
        System.out.println("utilisation de la classe LocalDate : ");
        LocalDate localDate = LocalDate.now();

        System.out.println("avec LocalDate.now() ");
        System.out.println(localDate);

        System.out.println("avec LocalTime ");
        System.out.println(LocalTime.of(12, 32, 22, 24));

        System.out.println("avec la classe LocalDateTime ");

        System.out.println("LocalDateTime.now()  " + LocalDateTime.now());

        System.out.println("LocalDateTime.of(2014, Month.DECEMBER, 25, 12, 32, 22, 23)  :  " + LocalDateTime.of(2014, Month.DECEMBER, 25, 12, 32, 22, 23));


    }
}
