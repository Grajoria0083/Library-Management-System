import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> availibleBooks = new ArrayList<>();

    List<Book> borrowBooks = new ArrayList<>();

    public void addBook(Book book){

        availibleBooks.add(book);
    }



    public void borrowBook(int ISBN){

        for (Book book:availibleBooks) {
            if (book.getISBN()==ISBN){
                borrowBooks.add(book);
                availibleBooks.remove(book);
                break;
            }
        }
    }



    public void returnBook(int ISBN){

        for (Book book:availibleBooks) {
            if (book.getISBN()==ISBN){
                availibleBooks.add(book);
                borrowBooks.remove(book);
                break;
            }
        }

    }




    void listAvailableBooks(){

        for (Book book:availibleBooks) {
            System.out.println(book);
        }
    }


}
