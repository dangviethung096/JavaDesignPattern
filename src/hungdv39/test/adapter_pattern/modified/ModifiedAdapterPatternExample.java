package hungdv39.test.adapter_pattern.modified;

import java.util.ArrayList;
import java.util.List;

public class ModifiedAdapterPatternExample {
    public static void main(String[] args) {
        // Rect
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area of Rectangle is : " + rectangle.calculateAreaOfRectangle() + " Square Unit.");
        // Triangle
        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of Triangle is : " + triangle.calculateAreaOfTriangle() + " Square Unit.");
        // Adapter
        RectInterface adapter = new TriangleAdapter(triangle);
        System.out.println("Area of Triangle using the triangle adapter is : " + getArea(adapter) + " Square Unit.");


        List<RectInterface> rectangleObjects = new ArrayList<>();
        rectangleObjects.add(rectangle);
        rectangleObjects.add(adapter);

        for (RectInterface rectInterface : rectangleObjects) {
            rectInterface.aboutRectangle();
        }

    }

    static double getArea(RectInterface r) {
        return r.calculateAreaOfRectangle();
    }

}
