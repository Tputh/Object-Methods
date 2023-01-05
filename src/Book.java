import java.util.Objects;

public class Book  {
    private String title;
    private int publishedYear;
    private Author author;



    public Book (Author author, String title, int publishedYear){
        this.author = author;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.publishedYear;
    }

    public void setYear(int publishedYear){
        this.publishedYear = publishedYear;
    }

    public Author author() {
        return this.author();
    }

    @Override
    public String toString() {
        return this.author + "; " + "Название книги - " + this.title + "; " + "Год издания - " + this.publishedYear + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return publishedYear == +book.publishedYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishedYear, author);
    }

}