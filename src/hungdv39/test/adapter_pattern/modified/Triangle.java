package hungdv39.test.adapter_pattern.modified;

public class Triangle implements TriInterface {
    public double base;
    public double height;

    public Triangle(int b, int h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Triangle: base = " + base + ", height = " + height);
    }

    @Override
    public double calculateAreaOfTriangle() {
        return 0.5 * base * height;
    }
}
