package Serializer;

import java.io.Serializable;

/**
 * Interface that allows to serialize objects
 * <br>
 * Created on 14/11/2018
 *
 * @author zu
 */
public interface Serializer {

    /**
     * Method that Serialize objects
     *
     * @param obj serializable type
     * @return String which is obj after serialization
     */
    String serialize(Serializable obj);
}
