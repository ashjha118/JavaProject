package javaclassandobject;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", 599.99);
        Book book2 = new Book("Data Structures", "Jane Smith", 450.50);

        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}
