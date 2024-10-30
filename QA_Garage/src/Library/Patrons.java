package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patrons {

    private int id;
    private String name;

    private List<Book> borrowed = new ArrayList<Book>();

    public Patrons(int id, String name, ArrayList<Book> borrowed) {
        this.id = id;
        this.name = name;
        this.borrowed = borrowed;
    }

    public Patrons(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(List<Book> borrowed) {
        this.borrowed = borrowed;
    }

    public void borrowBook(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ISBN of book to borrow: ");
        String isbn = scanner.nextLine();
        Book book = library.searchISBN(isbn);

        if (book == null) {
            System.out.println("Book not found");

        } else if (book.getAvailable()) {
            borrowed.add(book);
            System.out.println("Book now being borrowed");
            book.setAvailable(false);
        }
        else{
            System.out.println("Book already being borrowed.");
        }
    }

    public void returnBook(Book book){
        if (!(book.getAvailable())){
            borrowed.remove(book);
            book.setAvailable(true);
            System.out.println("Book successfully returned.");
        }
        else {
            System.out.println("Book already returned.");
        }
    }

    @Override
    public String toString() {
        return "Patrons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowed=" + borrowed +
                '}';
    }
}
