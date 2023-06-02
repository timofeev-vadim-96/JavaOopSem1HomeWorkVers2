package task3.test;

import org.junit.Test;
import task3.models.Author;
import task3.models.Book;
import task3.models.Library;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void TestAddBook() {
        Library GBLibrary = new Library();
        GBLibrary.addBook(new Book(new Author("Анджей", "Сапковский"), "Ведьмак: Башня Ласточки", false));
        assertEquals(1, GBLibrary.getSize());
    }

    @Test
    public void TestRemoveBookWithIndex() {
        Library GBLibrary = new Library();
        GBLibrary.addBook(new Book(new Author("Анджей", "Сапковский"), "Ведьмак: Башня Ласточки", false));
        GBLibrary.removeBookWithIndex(0);
        assertEquals(0, GBLibrary.getSize());
    }

    @Test
    public void TestRemoveBookWithTitle() {
        Library GBLibrary = new Library();
        GBLibrary.addBook(new Book(new Author("Анджей", "Сапковский"), "Ведьмак: Башня Ласточки", false));
        GBLibrary.removeBookWithTitle("Ведьмак");
        assertEquals(0, GBLibrary.getSize());
    }
}
