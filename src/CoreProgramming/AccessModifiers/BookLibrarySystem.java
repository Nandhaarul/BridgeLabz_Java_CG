package CoreProgramming.AccessModifiers;

import java.util.Scanner;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String isbn = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();

        EBook ebook = new EBook(isbn, title, author);
        ebook.displayDetails();

        String newAuthor = sc.nextLine();
        ebook.setAuthor(newAuthor);

        ebook.displayDetails();

        sc.close();
    }
}
