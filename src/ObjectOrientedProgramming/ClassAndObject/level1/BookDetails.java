package CoreProgramming.ClassAndObject.level1;
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        book.displayDetails();

        sc.close();
    }
}

