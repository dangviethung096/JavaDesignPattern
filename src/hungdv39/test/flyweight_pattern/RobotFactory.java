package hungdv39.test.flyweight_pattern;


import java.util.HashMap;

public class RobotFactory {
    private static HashMap<String, Robot> robotHashMap;
    private static int totalCreated = 0;

    public RobotFactory () {
        robotHashMap = new HashMap<>();
    }

    public int totalObjectsCreated() {
        return robotHashMap.size();
    }


    public static synchronized Robot getRobotFromFactory(String robotType) throws Exception {
        Robot robotCategory = robotHashMap.get(robotType);
        if (robotCategory == null) {
            switch (robotType) {
                case "small":
                    System.out.println("\nDon't have small robot");
                    robotCategory = new SmallRobot();
                    break;
                case "large":
                    System.out.println("\nDon't have large robot");
                    robotCategory = new LargeRobot();
                    break;
                case "fixed":
                    System.out.println("\nDon't have fixed robot");
                    robotCategory = new FixedSizeRobot();
                    break;
                default:
                    System.out.println("\nCannot create new robot. It's not supported robot type!");
                    throw new Exception("Cannot create new robot. It's not supported robot type");
            }

            robotHashMap.put(robotType, robotCategory);

        } else {
            System.out.print("\nRobot " + robotType + " is exist and coloring it");
        }

        return robotCategory;
    }
}
