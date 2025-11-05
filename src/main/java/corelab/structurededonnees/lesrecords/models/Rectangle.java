package corelab.structures_de_donnees.lesrecords.models;

public record Rectangle(int width, int height) implements Presentable {

    /**
     * Another constructor added to Rectangle Record
     * NotaBene : this constructor have no arguments
     *
     * @param width
     * @param height
     */
    public Rectangle {
        if (width <= 0 || height < 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }
    }

    @Override
    public void sePresenter() {
        System.out.println("je suis un Rectangle");
    }
}
