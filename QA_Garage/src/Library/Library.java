package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<Book>();


    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Library(){};

    public Book searchISBN(String isbn){
        for (Book book: bookList){
            if (isbn.equals(book.getIsbn())) {
                System.out.println(book.toString());
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book){
        bookList.add(book);
    }
}
