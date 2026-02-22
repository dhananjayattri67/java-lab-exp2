class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overloading
    void applyDiscount(double percentage) {
        price -= price * percentage / 100;
    }

    void applyDiscount(int amount) {
        price -= amount;
    }

    double getFinalPrice() {
        return price;
    }
}

class EBook extends Book {

    EBook(String title, String author, double price) {
        super(title, author, price);
    }

    double getFinalPrice() {
        return price + 50; // download fee
    }
}

class PrintedBook extends Book {

    PrintedBook(String title, String author, double price) {
        super(title, author, price);
    }

    double getFinalPrice() {
        return price + 100; // printing cost
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        EBook e = new EBook("Java Basics", "ABC", 500);
        e.applyDiscount(10);
        System.out.println("EBook Final Price: " + e.getFinalPrice());

        PrintedBook p = new PrintedBook("OOP Concepts", "XYZ", 600);
        p.applyDiscount(50);
        System.out.println("Printed Book Final Price: " + p.getFinalPrice());
    }
}
