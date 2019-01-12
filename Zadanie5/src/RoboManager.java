import java.util.HashMap;
import java.util.Map;


public class RoboManager {

    Map<String, Robo> prototypes = new HashMap<String, Robo>();

    public void addRobo(String name, Robo prototype) {
        prototypes.put(name, prototype);
    }

    public void deleteRobo(String name) {
        prototypes.remove(name);
    }

    public void deleteAllRobots() {
        prototypes.clear();
    }

    public Robo GetCopy(String name) {
        if (prototypes.containsKey(name))
            return (Robo) prototypes.get(name);
        else
            return null;
    }
}
