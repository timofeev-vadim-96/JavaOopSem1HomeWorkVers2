package task3.models;

public class Book {
    private Author author;
    private String title;
    private boolean available;

    public Book(Author author, String title, boolean available) {
        this.author = author;
        this.title = title;
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayInfo() {
        System.out.printf("Название: \"%s\", автор: %s, доступность: %s", this.title, this.author, showRusAvailability());
    }

    @Override
    public String toString() {
        return String.format("Название: \"%s\", автор: %s, доступность: %s", this.title, this.author, showRusAvailability());
    }

    public String showRusAvailability() {
        if (this.available) return "в наличии";
        else return "не в наличии";
    }
}
