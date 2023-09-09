public class EBook extends LibraryItem{

    String downloadLink;

    @Override
    public void borrowBook() {
        System.out.println("eBook has been sent to the user's device");
    }

    @Override
    public void returnBook() {
        System.out.println("eBook has been returned");
    }
}
