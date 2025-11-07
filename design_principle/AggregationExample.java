package design_principle;

public class AggregationExample {
public static void main(String[] args) {
   // Create independent Book objects
   Book b1 = new Book("Atomic Habits", "James Clear");
   Book b2 = new Book("The Alchemist", "Paulo Coelho");
   Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");

   Library lib1 = new Library("City Library");
   Library lib2 = new Library("College Library");

   lib1.addBook(b1);
   lib1.addBook(b2);

   lib2.addBook(b2);
   lib2.addBook(b3);

   // Display
   lib1.showLibraryBooks();
   lib2.showLibraryBooks();
}
}
