package hungdv39.test.bridge_pattern;

public class OnState implements State {
    @Override
    public void moveState() {
        System.out.println("On State");
    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is already on. Do not press button so hard");
    }
}
