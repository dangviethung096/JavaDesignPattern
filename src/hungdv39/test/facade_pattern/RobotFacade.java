package hungdv39.test.facade_pattern;

public class RobotFacade {
    RobotBody rBody;
    RobotColor rColor;
    RobotHands rHands;

    public RobotFacade() {
        rBody = new RobotBody();
        rColor = new RobotColor();
        rHands = new RobotHands();
    }

    public void constructMilanoRobot() {
        RobotBody.createRobot();
        System.out.println("Start creating milano robot!");
        rColor.setDefaultColor();
        rHands.setMilanoHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println("End creating milano robot!");
        System.out.println();
    }

    public void constructRobonautRobot() {
        RobotBody.createRobot();
        System.out.println("Start creating robonaut robot!");
        rColor.setGreenColor();
        rHands.setRobonautHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println("A robonaut robot is created");
        System.out.println();
    }

    public void destroyMilanoRobot() {
        RobotBody.destroyRobot();
        System.out.println("Destroying milano robot");
        rHands.resetMilanoHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println("Robot is destroyed");
        System.out.println();
    }

    public void destroyRobonautRobot() {
        RobotBody.destroyRobot();
        System.out.println("Destroying robonaut robot");
        rHands.resetRobonautHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println("Robot is destroyed");
        System.out.println();
    }


}
