public class Library {

    private static Library INSTANCE;

    private Library(){}


    public static Library getINSTANCE() {

        if (INSTANCE == null) {
            INSTANCE = new Library();
        }

        return INSTANCE;
    }
}
