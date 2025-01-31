package coreLab.structure_de_donnees.lesrecords.models;

public record Circle(Point center, double radius) implements Presentable {

    /**
     * supplementary area method added
     * @return
     */
    public double area() {
        return Math.PI * radius * radius;
    }




    /**
     * Presentable interface method implementation
     */
    @Override
    public void sePresenter() {
        System.out.println("je suis un Cercle ");
    }

}
