package Deserialize;

import com.sun.istack.internal.NotNull;

/**
 * Interface that allows to deserialize objects
 * <br>
 * Created on 14/11/2018
 *
 * @author zu
 */
public interface Deserializer {

    /**
     * Method that Deserialize objects
     *
     * @param serializedObject
     * @return object
     */
    Object Deserialize(@NotNull final String serializedObject);
}
