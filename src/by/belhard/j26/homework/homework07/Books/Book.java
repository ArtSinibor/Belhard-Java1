package by.belhard.j26.homework.homework07.Books;

import java.util.Arrays;
import java.util.List;

public class Book {

    private String title;
    private int pages;
    private List<Author> authors;
    BookFormat bookFormat;

    private static final String DEFAULT_TITLE = "Unknown title";
    private static final List<Author> DEFAULT_AUTHORS = Arrays.asList(new Author("Default name", "Default surname", 666));
    private static final BookFormat DEFAULT_FORMAT = BookFormat.A3;

    public Book(String title, int pages, List<Author> authors, BookFormat bookFormat) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.bookFormat = bookFormat;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "\nBook title: " + getTitle() +
                "\nNumber of pages: " + getPages() +
                "\nBook format: " + bookFormat +
                "\nAuthor:\n" + authors;
    }
}
