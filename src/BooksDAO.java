import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BooksDAO {

    private final static String CSV_FILE = "Books.csv";

    private List<BookImpl> booksList;

    public void addBook(BookImpl book) {

        try {
            FileWriter writer = new FileWriter(CSV_FILE, true);

            writer.append((char) book.getId());
            writer.append(';');
            writer.append(book.getTitle());
            writer.append(';');
            writer.append(book.getAuthor());
            writer.append('\n');

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void deleteBook(String bookId) {

    }

    public List<BookImpl> findAllBooks() {

        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] book = line.split(cvsSplitBy);

                final String author = book[2];
                final String title = book[1];
                final int id = Integer.parseInt(book[0]);

                final BookImpl newBook = new BookImpl(author, title, id);

                booksList.add(newBook);

                System.out.println("ID [id= " + book[0] + " , Title=" + book[1] + "  , Author=" + book[2] + " , UserID=" + book[3] +" ");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return booksList;
    }


}
