import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Books books = new Books();
        User user = new User();
        books.availableBooks();
        System.out.println("Hello world!");
        System.out.println("labb modul 5");
        System.out.println(books.getBook());
        user.readListOfBooks();


    }
}