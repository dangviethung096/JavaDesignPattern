package hungdv39.test.facade_pattern;

public class RobotBody {
    public static void createRobot() {
        System.out.println("Refer the manual before creation of a robot.");
    }

    public void createHands() {
        System.out.println("Hands manufactured.");
    }

    public void createRemainingParts() {
        System.out.println(" Remaining parts (other than hands) are created.");
    }

    public static void destroyRobot() {

    }

    public void destroyHands() {

    }

    public void destroyRemainingParts() {

    }

}
