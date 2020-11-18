package hungdv39.test.decorator_pattern;


public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Original house
        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();
        // Floor decorator
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setComponent(withoutDecorator);
        floorDecorator.makeHouse();
        // Paint decorator
        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setComponent(floorDecorator);
        paintDecorator.makeHouse();
    }
}
