package hungdv39.test.flyweight_pattern;

public class FixedSizeRobot implements Robot {

    private final String robotTypeCreated;

    public FixedSizeRobot() {
        robotTypeCreated = "A fixed size robot is created with default color";
        System.out.print(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.print(" with default robot's color: green");
    }
}
