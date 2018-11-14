import Serializer.Serializer;
import Serializer.SerializerFactory;
import Deserialize.Deserializer;
import Deserialize.DeserializerFactory;

public class Main {
    public static void main(String[] args) {
        TestClass sampleObject = new TestClass(1, "unknown", "hardlife");


        Serializer jsonSerializer = SerializerFactory.getSerializer("JSON");
        String serializedObject = jsonSerializer.serialize(sampleObject);
        System.out.println("Serialized object: " + serializedObject);

        Deserializer jsonDeserializer = DeserializerFactory.getDeserializer("JSON");
        TestClass deserializedObject = (TestClass) jsonDeserializer.deserialize(serializedObject);
        System.out.println("Deserialized object: " + deserializedObject.toString());
    }
}