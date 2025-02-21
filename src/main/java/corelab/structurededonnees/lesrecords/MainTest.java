package corelab.structurededonnees.lesrecords;

import corelab.structurededonnees.lesrecords.models.Circle;
import corelab.structurededonnees.lesrecords.models.Point;
import corelab.structurededonnees.lesrecords.models.Rectangle;

public class MainTest {
    public static void main(String[] args) {
        //initialisation
        Point point1 = new Point(3, 5);
        Point point2 = new Point(3, 5);

        //accès aux components
        System.out.println(point1.abscisse());
        System.out.println(point2.ordonne());

        //utilisation des méthodes toString() et hashCode()

        System.out.println("la méthode toString() " + point1.toString());
        System.out.println("la méthode hashCode() " + point1.hashCode());

        //comparaison
        System.out.println("point1 est il égal à point2 : " + point1.equals(point2));

        /**
         * Circle record example
         */
        Circle circle = new Circle(point1, 2.5);

        circle.sePresenter();

        System.out.println("l'air du cercle circle est  " + circle.area());

        /**
         * Rectangle record example
         */

        Rectangle rectangle = new Rectangle(15, 25);

        rectangle.sePresenter();

        System.out.println("l'air de ce rectangle est de  " + rectangle.width() * rectangle.height());
    }
}
