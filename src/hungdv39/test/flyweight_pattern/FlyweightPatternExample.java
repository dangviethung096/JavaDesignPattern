package hungdv39.test.flyweight_pattern;

import java.util.Random;

public class FlyweightPatternExample {
    public static void main(String[] args) throws Exception {
        Robot myRobot;
        // small
        for (int i = 0; i < 3; i++) {
            myRobot = RobotFactory.getRobotFromFactory("Small");
            Thread.sleep(200);
            myRobot.showMe(randomColor());
        }
        // large
        for (int i = 0; i < 5; i++) {
            myRobot = RobotFactory.getRobotFromFactory("Large");
            Thread.sleep(200);
            myRobot.showMe(randomColor());
        }
        // fixed
        for (int i = 0; i < 4; i++) {
            myRobot = RobotFactory.getRobotFromFactory("Fixed");
            Thread.sleep(99);
            myRobot.showMe(randomColor());
        }

        System.out.println("Number of constructed robot = " + RobotFactory.totalObjectsCreated());

    }

    static Random r = new Random();

    public static String randomColor() {
        int val = r.nextInt();
        if (val % 2 == 0) {
            return "red";
        } else {
            return "blue";
        }
    }
}
