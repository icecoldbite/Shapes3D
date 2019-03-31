public class RectangularPrism extends Prism {
    private double length;
    private double width;
    private double height;

    public RectangularPrism(double numberOfFaces, double length, double width, double height) {
        super(numberOfFaces);
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getBaseArea() {
        return 0;
    }

    @Override
    public double getFaceArea() {
        return 0;
    }


}
