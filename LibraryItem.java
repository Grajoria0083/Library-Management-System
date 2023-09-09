public abstract class LibraryItem implements Book{

    public String title;
    public String author;
    public int ISBN;
    public boolean isAvailable;



    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getISBN(){
        return ISBN;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void borrowBook(){
        isAvailable = false;
    }
    public void returnBook(){
        isAvailable =true;
    }


}
