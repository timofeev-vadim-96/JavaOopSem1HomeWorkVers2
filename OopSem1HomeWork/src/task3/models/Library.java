package task3.models;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<Book>();
    }

    public Library addBook(Book newBook) {
        catalog.add(newBook);
        return this;
    }

    public void removeBookWithIndex(int index) {
        if (index < catalog.size()) {
            catalog.remove(index);
            System.out.printf("Книга с индексом <%s> успешно удалена.\n", index);
        } else System.out.printf("Книга с индексом <%s> не найдена.\n", index);

    }

    public String removeBookWithTitle(String titleToRemove) {
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).getTitle().toLowerCase().contains(titleToRemove.toLowerCase())) {
                String tempTitle = catalog.get(i).getTitle();
                catalog.remove(i);
                return String.format("Книга с названием \"%s\" успешно удалена из каталога.", tempTitle);
            }
        }
        return String.format("Книга с названием %s не найдена в каталоге.", titleToRemove);
    }

    public void showAvailableBooks() {
        System.out.println("Список доступных книг: ");
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).isAvailable()) {
                System.out.printf("Индекс в каталоге: %s. %s\n", i, catalog.get(i));
            }
        }
    }

    public void searchByAuthor(String inputAuthor) {
        boolean flag = true;
        for (int i = 0; i < catalog.size(); i++) {

        }
        int counter = 0;
        for (int i = 0; i < catalog.size(); i++) {
            String authorFirstName = catalog.get(i).getAuthor().getFirstName();
            String authorLastName = catalog.get(i).getAuthor().getLastName();

            if (authorFirstName.contains(inputAuthor) ||
                    authorLastName.contains(inputAuthor) ||
                    (authorFirstName + " " + authorLastName).contains(inputAuthor) ||
                    (authorLastName + " " + authorFirstName).contains(inputAuthor)) {
                if (counter == 0) System.out.printf("Список книг %s: \n", catalog.get(i).getAuthor());
                System.out.printf("Индекс в каталоге: %s. %s\n", i, catalog.get(i));
                flag = false;
            }
        }
        if (flag) System.out.printf("Книги автора %s в каталоге не найдены\n", inputAuthor);
    }

    public int getSize() {
        return catalog.size();
    }
}
