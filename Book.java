public interface Book {

    String getTitle();
    String getAuthor();
    int getISBN();
    boolean isAvailable();
    void borrowBook();
    void returnBook();
}
