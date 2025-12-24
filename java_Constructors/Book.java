package java_Constructors;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("Format: " + format);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();
        System.out.println();

        EBook eb1 = new EBook("978-1492056270", "Learning Java", "Marc Loy", "PDF");
        eb1.displayEBookDetails();
    }
}
