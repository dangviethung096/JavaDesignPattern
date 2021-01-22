package hungdv39.test.bridge_pattern;

public class OffState implements State{
    @Override
    public void moveState() {
        System.out.println("Off State");
    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is off now. Don't press off button again");
    }

}
