import java.sql.SQLOutput;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Bolesław","Prus", 55);
        Author author1 = new Author("Eliza","Orzeszkowa",34);
        System.out.println(author);
        author.setSurname("Leśmian");
        System.out.println(author);
        System.out.println(author1);
        System.out.println("Name: "+author1.getName()+" age: "+author1.getAge());
    }
}