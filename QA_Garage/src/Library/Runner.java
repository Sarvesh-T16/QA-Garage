package Library;
import java.util.ArrayList;
import java.util.List;
public class Runner {
    public static void main(String[] args) {
        Library library1 = new Library();
        PatronsList patronList1 = new PatronsList();
        Book book1 = new Book("1", "50 shades of grey", "EL James", true);
        Patrons patron1 = new Patrons(1, "Sarvesh", new ArrayList<Book>());

        library1.addBook(book1);
        patronList1.addPatron(patron1);

        patron1.borrowBook(library1);

        // Displaying all books and patrons
        library1.displayBooks();
        patronList1.displayPatrons();

    }
}
