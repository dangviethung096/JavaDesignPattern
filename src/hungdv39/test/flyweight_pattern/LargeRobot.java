package hungdv39.test.flyweight_pattern;

public class LargeRobot implements Robot {
    private final String robotTypeCreated;

    public LargeRobot() {
        robotTypeCreated = "A large robot is created";
        System.out.print(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.print(" with " + color + " color");
    }
}
