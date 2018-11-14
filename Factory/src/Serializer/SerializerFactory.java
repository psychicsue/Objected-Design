package Serializer;

import com.sun.istack.internal.NotNull;

public class SerializerFactory {

    private static final String JSON = "JSON";
    private static final String XML = "XML";
    private static final String CSV = "CSV";

    public static Serializer getSerializerFactory(@NotNull final String typeOfSerialization) {

        if (typeOfSerialization.equalsIgnoreCase(JSON)) {
            return new SerializerJsonImpl();
        } else if (typeOfSerialization.equalsIgnoreCase(CSV)) {
            return new SerializerCsvImpl();
        } else if (typeOfSerialization.equalsIgnoreCase(XML)) {
            return new SerializerXmlImpl();
        } else
            throw new IllegalArgumentException("Passed Incorrect Deserialized: " + typeOfSerialization);
    }
}
