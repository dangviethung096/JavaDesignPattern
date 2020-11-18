package hungdv39.test.decorator_pattern;

public class FloorDecorator extends AbstractDecorator {
    @Override
    public void makeHouse() {
        super.makeHouse();
        addFloor();
    }

    private void addFloor() {
        System.out.println("Making an additional floor on top of the house");
    }


}
