package task3;

import task3.models.Author;
import task3.models.Book;
import task3.models.Library;

public class Main {
    public static void main(String[] args) {
        Library GBLibrary = new Library();
        GBLibrary.
                addBook(new Book(new Author("Джон Рональд Руэл", "Толкин"), "Прощай, оружие!", true)).
                addBook(new Book(new Author("Кристи", "Голден"), "Артас. Восхождение Короля-лича", true)).
                addBook(new Book(new Author("Уильям", "Кинг"), "Иллидан", true)).
                addBook(new Book(new Author("Анджей", "Сапковский"), "Ведьмак: Башня Ласточки", false));
        GBLibrary.showAvailableBooks();
        GBLibrary.removeBookWithIndex(2);
        GBLibrary.showAvailableBooks();
        System.out.println(GBLibrary.removeBookWithTitle("Артас"));
        GBLibrary.searchByAuthor("Сапковский");

    }
}
