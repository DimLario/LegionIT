package booksStoreOOP;

public class BooksStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook("Harry Potter", "J.K. Rowling", 1, 10.5, false,"MP3", 128, "Smith");
        book1.printBookDetails();  //calls method from class Book

        EBook book2 = new EBook("Anna Karenina", "L. Tolstoy", 2, 20.2, true, "www.download.com");
        book2.setUsdPrice(10);     //changes price of the book2
        book2.printBookDetails();  //calls method from class Book

//        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1, 10.5, false);
//        Book book2 = new Book("Anna Karenina", "L. Tolstoy", 2, 20.2, true);
//
//        book1.setUnavailable(true);  //changes availability from false to true
//        book2.setUsdPrice(30);  //changes price for book2 from 20 to 30
//
//        book1.printBookDetails();  //calls method printBookDetails from class Book with using variables for book1
//        book2.printBookDetails();  //calls method printBookDetails from class Book with using variables for book2
    }
}
