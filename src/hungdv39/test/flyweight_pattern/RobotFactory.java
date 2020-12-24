package hungdv39.test.flyweight_pattern;

import java.util.HashMap;

public class RobotFactory {
    private final static HashMap<String, Robot> robots;

    static {
        robots = new HashMap<>();
    }

    public static int totalObjectsCreated() {
        return robots.size();
    }

    public static synchronized Robot getRobotFromFactory(String robotType) throws Exception {
        Robot robotCategory = robots.get(robotType);
        if (robotCategory == null) {
            switch (robotType) {
                case "Small":
                    robotCategory = new SmallRobot();
                    break;
                case "Large":
                    robotCategory = new LargeRobot();
                    break;
                case "Fixed":
                    robotCategory = new FixedSizeRobot();
                    break;
                default:
                    throw new Exception("Wrong robot type: " + robotType);
            }
            System.out.print("\nCreate new robot type: " + robotType);
            robots.put(robotType, robotCategory);
        } else {
            System.out.print("Found old robot: " + robotType);
        }

        return robotCategory;
    }
}
