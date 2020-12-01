package hungdv39.test.facade_pattern;

public class RobotHands {
    public void setMilanoHands() {
        System.out.println("Robot will have Milano H1 hands");
    }

    public void setRobonautHands() {
        System.out.println("Robot will have Robonaut hands");
    }

    public void resetMilanoHands() {
        System.out.println("Milano H1 hands are destroyed");
    }

    public void resetRobonautHands() {
        System.out.println("Robonaut hands are destroyed");
    }
}
