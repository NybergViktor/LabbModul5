import java.util.ArrayList;
import java.util.Scanner;



public class Books {
    Scanner myScanner = new Scanner(System.in);

    ArrayList<String> book = new ArrayList<String>();
    ArrayList<String> bookLentOut = new ArrayList<String>();




    public void setBook() {
        System.out.println("what book");
        this.book = book;
        book.add(myScanner.nextLine());




    }

    public void moveBookFromListToLentOut() {

    }

    public void availableBooks() {

        book.add("Harry Potter 1");
        book.add("Harry Potter 2");
        book.add("Harry Potter 3");
        book.add("Harry Potter 4");
        book.add("Harry Potter 5");
        book.add("Harry Potter 6");
        book.add("Harry Potter 7 del 1");
        book.add("Harry Potter 7 del 2");
        book.add("Fast and Furious 1");
        book.add("Fast and Furious 2");


    }

    public ArrayList<String> getBook() {

        return book;
    }
    public void lentOutBooks() {
        System.out.println("Vilken bok vill du låna?");
        getBook();
        int altbok = myScanner.nextInt();
        book.get(altbok);
        getBook();


    }
}
