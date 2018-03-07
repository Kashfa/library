import java.util.ArrayList;

public class Borrower {

    private String name;
    private int limit;
    private ArrayList<Book> bookborrowed;

    public Borrower(String name, int limit) {
        this.name = name;
        this.limit = limit;
        this.bookborrowed = new ArrayList<>();

    }
}
