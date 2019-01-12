public class RoboFourPrototype extends Robo {
    private static final String MODULE = "D";

    public Object clone() {
        RoboFourPrototype fourthRobo = new RoboFourPrototype();
        return fourthRobo;
    }

    public String buildModule() {
        return MODULE;
    }

}
