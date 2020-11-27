package hungdv39.test.adapter_pattern.basic;

public class CalculatorAdapter {
    public double getArea(Triangle triangle) {
        Calculator c = new Calculator();

        Rectangle rect = new Rectangle();

        rect.length = triangle.base;
        rect.width = 0.5 * triangle.height;

        return c.getArea(rect);
    }
}
