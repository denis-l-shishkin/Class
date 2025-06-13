import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }
}