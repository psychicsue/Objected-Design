package Deserialize;

import com.sun.istack.internal.NotNull;

public class DeserializerFactory {

    private static final String JSON = "JSON";
    private static final String XML = "XML";
    private static final String CSV = "CSV";

    public static Deserializer getDeserializerFactory(@NotNull final String typeOfSerialization) {

        if (typeOfSerialization.equalsIgnoreCase(JSON)) {
            return new DeserializerJsonImpl();
        } else if (typeOfSerialization.equalsIgnoreCase(CSV)) {
            return new DeserializerCsvImpl();
        } else if (typeOfSerialization.equalsIgnoreCase(XML)) {
            return new DeserializerXmlImpl();
        } else
            throw new IllegalArgumentException("Passed Incorrect Deserialized: " + typeOfSerialization);
    }
}
