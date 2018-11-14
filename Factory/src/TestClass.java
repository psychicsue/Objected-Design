import java.io.Serializable;

public class TestClass implements Serializable {
    private final int id;

    private final String author;

    private final String title;

    public TestClass(final int id, final String author, final String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
