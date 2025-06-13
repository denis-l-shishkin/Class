public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Ray", "Bradbury");
        Book book1 = new Book("Fahrenheit 451", author1, 1953);
        System.out.println("Книга под номером 1");
        System.out.println(book1);
        Author author2 = new Author("Evgeniy", "Zamyatin");
        Book book2 = new Book("We", author2, 1921);
        System.out.println();
        System.out.println("Книга под номером 2");
        System.out.println(book2);
        Author author3 = new Author("Evgeniy", "Zamyatin");
        Book book3 = new Book("We", author2, 1924);
        System.out.println();
        System.out.println("Книга под номером 3");
        System.out.println(book3);
        book2.setYearPublished(1924);
        System.out.println("Исправлен год публикации книги 2");
        System.out.println(book2.getYearPublished());
        System.out.println(author1.hashCode() == author2.hashCode());
        System.out.println(author3.hashCode() == author2.hashCode());
        System.out.println(author1.equals(author2));
        System.out.println(author3.equals(author2));
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book3.hashCode() == book2.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book3.equals(book2));
    }
}
