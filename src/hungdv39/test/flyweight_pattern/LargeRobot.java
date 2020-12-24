package hungdv39.test.flyweight_pattern;

public class LargeRobot implements Robot {
    private final String robotTypeCreated;

    public LargeRobot() {
        robotTypeCreated = "A Large robot is created";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color");
    }
}
