package hungdv39.test.flyweight_pattern;


public class SmallRobot implements Robot {

    private final String robotTypedCreated;

    public SmallRobot() {
        robotTypedCreated = "A small robot is created";
        System.out.print(robotTypedCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color");
    }
}
