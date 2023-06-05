package stringsLesson;

public class Book {
    // describe a book, create all the variables we need
// name, author, id, price in USD, availability
// using conversion rate, calculate EUR price of book
// using conversion rate, calculate RUB price of book
// print all the book details including price

    String euro = "EUR";
    String ruble = "RUB";

    public static void main(String[] args) {
        Book book1 = new Book(); // <- new OBJECT from class Book + new METHOD createNewBook ->
        book1.createNewBook("Harry Potter", "J.K. Rowling", 1, 10.5, false);
        book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20.2, true);
    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {

        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInRubles = calculatePrice(priceInUSD, ruble);

        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR, " + priceInRubles + " RUB");
        System.out.println("Book is available: " + isAvailable);
    }

    public double calculatePrice(double priceInUSD, String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;
    }
}

