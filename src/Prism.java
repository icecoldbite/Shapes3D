public abstract class Prism implements Shape {
    private double numberOfFaces;

    public Prism(double numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    @Override
    public double getSurfaceArea() {
        return (getBaseArea() * 2) + (getAverageFaceArea() * numberOfFaces);
    }

    public abstract double getVolume();

    public abstract double getBaseArea();
    public abstract double getAverageFaceArea();

}
