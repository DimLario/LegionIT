package booksStoreOOP;

public class EBook extends Book{
    String downloadURL;

    public EBook(String name, String AuthorName, int id, double price, boolean isAvailable, String url) {
        super(name, AuthorName, id, price, isAvailable);
        this.downloadURL = url;
    }

    public String getDownloadURL() {
        return downloadURL;
    }
    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Download UL:  " + downloadURL);
    }
}
