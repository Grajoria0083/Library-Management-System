import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static PhysicalBook addBookToLibraray(PhysicalBook book){

        System.out.println("Enter Book Title");
        book.title = sc.next();

        System.out.println("Enter Book Author");
          book.author = sc.next();

        System.out.println("Enter Book ShelfLocation");
        book.shelfLocation = sc.next();

        System.out.println("Enter Book ISBN");
        book.ISBN = sc.nextInt();

        book.isAvailable = true;

        return book;
    }

    public static EBook addBookToLibraray(EBook book){

        System.out.println("Enter Book Title");
        book.title = sc.next();

        System.out.println("Enter Book Author");
        book.author = sc.next();

        System.out.println("Enter Book ShelfLocation");
        book.downloadLink = sc.next();

        System.out.println("Enter Book ISBN");
        book.ISBN = sc.nextInt();

        book.isAvailable = true;

        return book;
    }
    public static void main(String[] args) {


        Library library = new Library();

        /*
        library.addBook(addBookToLibraray(new PhysicalBook()));
        library.addBook(addBookToLibraray(new PhysicalBook()));
        library.addBook(addBookToLibraray(new EBook()));
        library.addBook(addBookToLibraray(new EBook()));
         */



    }
}
