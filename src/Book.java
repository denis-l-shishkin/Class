import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearPublished;

    public Book(String title, Author author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Название кнги: " + title + "\n" +
                "Автор: " + author + "\n" +
                "Год издания: " + yearPublished;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished);
    }
    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && yearPublished == book.yearPublished;
    }
}
