package hungdv39.test.flyweight_pattern;

public class SmallRobot implements Robot {
    private final String robotTypeCreated;

    public SmallRobot() {
        robotTypeCreated = "A small robot is created";
        System.out.print(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.print(" with " + color + " color");
    }
}
