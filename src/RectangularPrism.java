public class RectangularPrism extends Prism {
    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height) {
        super(4);
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public double getBaseArea() {
        return length * width;
    }

    @Override
    public double getAverageFaceArea() {  //Takes the average of the height * width face and the height * length face
        return (height * (length + width)) / 2;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


}
