
//practice problem 06


class Book {
    private int bookId;
    private String bookName;
    private String year;
    private float price;
    private String status;

    public Book(int bookId, String bookName, String year, float price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.year = year;
        this.price = price;
        this.status = "Available";
    }

    public void displayBookDetails() {
        System.out.println("ID: " + bookId);
        System.out.println("Name: " + bookName);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    public String getBookName(){
        return bookName;
    }
}

class Librarian {
    private int id;
    private String name;

    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean searchBook(String name, Book[] books) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void addBook(Book[] books, Book newBook) {
       
    }
}

class Publisher {
    private int id;
    private String name;
    private String address;
    private String phoneNo;

    public Publisher(int id, String name, String address, String phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void updatePhoneNo(String newPhoneNo) {
        this.phoneNo = newPhoneNo;
    }
}

class User {
    private int userId;
    private String userName;
    private String userAddress;
    private String phoneNo;

    public User(int userId, String userName, String userAddress, String phoneNo) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    public void returnBook(Book book) {
        book.updateStatus("Available");
    }

    public void updateAddress(String newAddress) {
        this.userAddress = newAddress;
    }
}

public class Scenario1 {
    
}
