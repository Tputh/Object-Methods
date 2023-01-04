import java.io.PrintStream;

public class Main{






    public static void main(String[] args) {
        System.out.println("Дз. Методы объектов");

        System.out.println();
        System.out.println("Моя личная Библиотека");
        System.out.println();

        Author author1 = new Author("Харуки ", "", "Мураками");
        Book book1 = new Book(author1, "Хроники заводной птицы", 1992);
        System.out.println(book1);

        System.out.println();
        System.out.println("==============================================");
        System.out.println();

        Author author2 = new Author("Габриэля ","Гарсиа ","Маркеса");
        Book book2 = new Book(author2,"100 лет одиночества", 1967);
        System.out.println(book2);
        System.out.println(book1.equals(book2));


    }

}