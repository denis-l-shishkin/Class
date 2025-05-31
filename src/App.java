public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Ray", "Bradbury");
        Book book1 = new Book("Fahrenheit 451", author1, 1953);
        System.out.println("Книга под номером 1");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println(book1.getYearPublished());
        Author author2 = new Author("Evgeniy", "Zamyatin");
        Book book2 = new Book("We", author2, 1921);
        System.out.println();
        System.out.println("Книга под номером 2");
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        System.out.println(book2.getYearPublished());
        book2.setYearPublished(1924);
        System.out.println("Исправлен год публикации книги 2");
        System.out.println(book2.getYearPublished());
    }
}
