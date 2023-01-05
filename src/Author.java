import java.util.Objects;

public class Author {

    private String name;
    private String patronymic;
    private String surname;

    public Author(String name, String patronymic, String surname){
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;

    }
    public String getName() {
        return this.name;
    }


    public String getPatronymic(){
        return this.patronymic;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return "Автор - " +  name + patronymic + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(patronymic, author.patronymic) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, patronymic, surname);
    }
}



