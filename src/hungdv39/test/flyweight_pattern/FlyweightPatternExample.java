package hungdv39.test.flyweight_pattern;

import java.util.Random;

public class FlyweightPatternExample {
    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\nFlyweight pattern\n");
        Robot myRobot;
        // Small
        for (int i = 0; i < 3; i++) {
            myRobot = RobotFactory.getRobotFromFactory("small");
            Thread.sleep(100);
            myRobot.showMe(getRandomColor());
        }

        System.out.println("\nNumber of created : " + robotFactory.totalObjectsCreated());
        // Large
        for (int i = 0; i < 5; i++) {
            myRobot = RobotFactory.getRobotFromFactory("large");
            Thread.sleep(100);
            myRobot.showMe(getRandomColor());
        }

        System.out.println("\nNumber of created : " + robotFactory.totalObjectsCreated());
        // Fixed
        for (int i = 0; i < 4; i++) {
            myRobot = RobotFactory.getRobotFromFactory("fixed");
            Thread.sleep(100);
            myRobot.showMe(getRandomColor());
        }

        System.out.println("\nNumber of created : " + robotFactory.totalObjectsCreated());
    }

    public static String getRandomColor() {
        Random r = new Random();
        int val = r.nextInt() % 3;
        if (val == 0) {
            return "red";
        } else if (val == 1) {
            return "blue";
        } else if (val == 2) {
            return "grey";
        }

        return "green";
    }

}
