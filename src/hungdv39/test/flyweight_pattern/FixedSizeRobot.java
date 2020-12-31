package hungdv39.test.flyweight_pattern;

public class FixedSizeRobot implements Robot {
    private final String robotTypeCreated;

    public FixedSizeRobot() {
        robotTypeCreated = "A Fixed size robot is created! ";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with default green color");
    }
}
