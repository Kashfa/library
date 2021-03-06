import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(3);
        book = new Book();

    }

    @Test
    public void canReturnNumberOfBooks() {
        assertEquals(0, library.numberOfBooks());
    }


    @Test
    public void canAddBookToStock() {
        library.addBook(book);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void canCheckIfLibraryIsFull() {
        assertEquals(true, library.checkLibrary());

    }
}
