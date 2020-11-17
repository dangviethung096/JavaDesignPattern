package hungdv39.test.decorator_pattern;

public class PaintDecorator extends AbstractDecorator {
    @Override
    public void makeHouse() {
        super.makeHouse();

        paintTheHouse();
    }

    private void paintTheHouse() {
        System.out.println("Painting the house!");
    }
}
