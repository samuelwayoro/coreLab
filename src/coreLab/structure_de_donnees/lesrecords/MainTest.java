package coreLab.structure_de_donnees.lesrecords;

public class MainTest {
    public static void main(String[] args) {
        //initialisation
        Point point1 = new Point(3, 5);
        Point point2 = new Point(3, 5);

        //accès aux components
        System.out.println(point1.x());
        System.out.println(point2.y());

        //utilisation des méthodes toString() et hashCode()

        System.out.println("la méthode toString() " + point1.toString());
        System.out.println("la méthode hashCode() " + point1.hashCode());

        //comparaison
        System.out.println("point1 est il égal à point2 : " + point1.equals(point2));
    }

    /***
     * déclaration du record Point avec deux components x et y de type entier
     * @param x
     * @param y
     */
    record Point(int x, int y) {
    }
}
