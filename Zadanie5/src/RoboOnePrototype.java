public class RoboOnePrototype extends Robo {
    private static final String MODULE = "A";

    public Object clone() {
        RoboOnePrototype firstRobot = new RoboOnePrototype();
        return firstRobot;
    }

    public String buildModule() {
        return MODULE;
    }

}
