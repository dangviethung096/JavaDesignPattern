package hungdv39.test.adapter_pattern.class_type;

public class TriangleAdapter extends Triangle implements RectInterface {

    public TriangleAdapter(int b, int h) {
        super(b, h);
    }

    @Override
    public void aboutRectangle() {
        super.aboutTriangle();
    }

    @Override
    public double calculateAreaOfRectangle() {
        return super.calculateAreaOfTriangle();
    }
}
