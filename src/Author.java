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






}

