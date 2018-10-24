/**
 * BookImpl
 * <br>
 * Created on 24/10/2018
 *
 * @author zu
 */
public class BookImpl implements Books {

    private final String author;
    private final String title;
    private final int id;


    public BookImpl(final String author, final String title, final int id) {
        this.author = author;
        this.title = title;
        this.id = id;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getId() {
        return id;
    }
}
