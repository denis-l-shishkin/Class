public class Book {
    String author;
    int pageAmount;
    String publisher;

    public Book(String author, int pageAmount, String publisher) {
        this.author = author;
        this.pageAmount = pageAmount;
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
