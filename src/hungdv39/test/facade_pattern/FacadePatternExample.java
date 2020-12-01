package hungdv39.test.facade_pattern;

public class FacadePatternExample {
    public static void main(String[] args) {
        RobotFacade milanoRobot = new RobotFacade();
        milanoRobot.constructMilanoRobot();

        RobotFacade robonautRobot = new RobotFacade();
        robonautRobot.constructRobonautRobot();

        // Destroy
        milanoRobot.destroyMilanoRobot();
        robonautRobot.destroyRobonautRobot();
    }
}
