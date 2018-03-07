import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int numberOfBooks() {
       return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean checkLibrary() {
        return this.capacity - this.countBooks() > 0;
    }
}
