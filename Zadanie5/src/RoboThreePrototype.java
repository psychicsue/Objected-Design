public class RoboThreePrototype extends Robo {
    private static final String MODULE = "C";

    public Object clone() {
        RoboThreePrototype thirdRobot = new RoboThreePrototype();
        return thirdRobot;
    }

    public String buildModule() {
        return MODULE;
    }

}
