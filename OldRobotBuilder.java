/**
 * Created by davit.harutyunyan on 5/20/2016.
 */
public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Head2");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Torso2");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Arms2");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Legs2");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }


}
