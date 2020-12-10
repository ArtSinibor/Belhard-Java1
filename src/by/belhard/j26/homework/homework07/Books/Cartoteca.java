package by.belhard.j26.homework.homework07.Books;

import java.util.ArrayList;
import java.util.List;

public class Cartoteca {

    public static List<Book> getBooksOfAuthor(List<Book> books, String name, String surname){

        List<Book> result = new ArrayList<>();

        Author searchAuthor = new Author(name, surname, 100);

        for (Book book:books){
            for (Author author: book.getAuthors()){
                if (searchAuthor.equals(author)){
                    result.add(book);
                    break;
                }
            }
        }
        return result;
    }

}
