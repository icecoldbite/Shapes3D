public class TriangularPrism extends Prism {
    private double height;
    private double sideLength;

    public TriangularPrism(double sideLength, double height) {
        super(3);
        this.height = height;
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    public double getAverageFaceArea() {
        return sideLength * height;
    }

    public double getHeight() {
        return height;
    }

    public double getSideLength() {
        return sideLength;
    }
}
