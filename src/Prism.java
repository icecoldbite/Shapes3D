public abstract class Prism implements Shape {
    private double numberOfFaces;

    public Prism(double numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    @Override
    public double getSurfaceArea() {
        return (getBaseArea() * 2) + (getFaceArea() * numberOfFaces);
    }

    public abstract double getVolume();

    public abstract double getBaseArea();
    public abstract double getFaceArea();

}
