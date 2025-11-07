package design_principle;

import java.util.*;

class Book {
 private String title;
 private String author;

 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 public void showBookDetails() {
     System.out.println("Title: " + title + ", Author: " + author);
 }
}

class Library {
 private String name;
 private List<Book> books; 
 public Library(String name) {
     this.name = name;
     books = new ArrayList<>();
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void showLibraryBooks() {
     System.out.println("\nLibrary: " + name);
     for (Book book : books) {
         book.showBookDetails();
     }
 }
}
