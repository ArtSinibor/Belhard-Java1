package by.belhard.j26.homework.homework07.Books;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private int age;

    private static final String DEFAULT = "Unknown";
    private static final int DEFAULT_AGE = 666;

    public Author(String name, String surname, int age) {

        if (name == null || name.isEmpty()) name = DEFAULT;
        if (surname == null || surname.isEmpty()) surname = DEFAULT;
        if (age < 10) age = DEFAULT_AGE;

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Author))
            return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                "\nsurname: " + getSurname() +
                "\nage: " + getAge();
    }

}
