public class TriangularPrism extends Prism {

    public TriangularPrism(double numberOfFaces) {
        super(numberOfFaces);
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
