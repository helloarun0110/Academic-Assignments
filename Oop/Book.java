
//practice problem 5.1


public class Book {
    String title;
    String author;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showInfo() {
        if (author == null) {
            System.out.println("Title: " + title);
        } else {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Clean Code", "Robert C. Martin");

        b1.showInfo();
        b2.showInfo();
    }
}
