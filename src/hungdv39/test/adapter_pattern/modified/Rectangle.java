package hungdv39.test.adapter_pattern.modified;

public class Rectangle implements RectInterface {
    public double width;
    public double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Rectangle: width = " + width + ", length = " + length);
    }

    @Override
    public double calculateAreaOfRectangle() {
        return width * length;
    }
}
