public class RoboTwoPrototype extends Robo {
    private static final String MODULE = "B";

    public Object clone() {
        RoboTwoPrototype secondRobot = new RoboTwoPrototype();
        return secondRobot;
    }

    public String buildModule() {
        return MODULE;
    }

}
