package by.belhard.j26.homework.homework07;

import by.belhard.j26.homework.homework07.Books.Author;
import by.belhard.j26.homework.homework07.Books.Book;
import by.belhard.j26.homework.homework07.Books.BookFormat;
import by.belhard.j26.homework.homework07.Books.Cartoteca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        Author author1 = new Author("Yagami", "Light", 17);
        Author author2 = new Author("Baba", "Yaga", 524);

        Book book1 = new Book("Death note", 256, Collections.singletonList(author1), BookFormat.A4);
        Book book2 = new Book("Poisons", 500, Collections.singletonList(author2), BookFormat.A3_albom);
        Book book3 = new Book("Herbs and musrooms", 1500, Collections.singletonList(author2), BookFormat.A5);

        System.out.println(book1 + "\n");
        System.out.println(book1 + "\n");

        List<Book> books = Arrays.asList(book1, book2, book3);

        List<Book> booksByAuthor = Cartoteca.getBooksOfAuthor(books, "Baba", "Yaga");
        System.out.println(booksByAuthor);

    }
}
