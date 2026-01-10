package ObjectOrientedProgramming.ObjectModeling.Assisted;

import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books = new ArrayList<>();

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);
        for (Book b : books) {
            b.displayBook();
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Java Concurrency", "Brian Goetz");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.displayLibraryBooks();
        lib2.displayLibraryBooks();
    }
}
