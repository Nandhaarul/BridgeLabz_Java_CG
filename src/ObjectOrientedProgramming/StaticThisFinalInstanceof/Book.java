package ObjectOrientedProgramming.StaticThisFinalInstanceof;

class Book {

    // ---------- Static ----------
    static String libraryName = "Central City Library";

    // ---------- Final ----------
    final String isbn;

    // Instance variables
    String title;
    String author;

    // ---------- Constructor using this ----------
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;   // final variable initialized once
    }

    // ---------- Static method ----------
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // ---------- Main method ----------
    public static void main(String[] args) {

        Book b1 = new Book("Clean Code", "Robert C. Martin", "9780132350884");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "9780134685991");

        // Static method call
        Book.displayLibraryName();

        // ---------- instanceof ----------
        if (b1 instanceof Book) {
            System.out.println("\nBook 1 Details:");
            b1.displayBookDetails();
        }

        if (b2 instanceof Book) {
            System.out.println("\nBook 2 Details:");
            b2.displayBookDetails();
        }
    }
}
