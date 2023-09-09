public class PhysicalBook extends LibraryItem{

    String shelfLocation;

    public PhysicalBook() {
    }

    @Override
    public void borrowBook() {
        isAvailable = false;
    }

    @Override
    public void returnBook() {
        isAvailable = true;
    }
}
