
import java.util.ArrayList;

record Item(String name, String Genre) {
    public Item(String name) {
        this(name, "Genre");
    }
}

public class Books {

    private int arraynr = 0;
    Object bookList[] = new Object[10];

    public ArrayList[] arrayBookList(){
        bookList[arraynr] = new Item("Hobbit", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 1", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 2", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 3", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 4", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 5", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 6", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 7 del 1", "Fantasy");
        bookList[arraynr += 1] = new Item("HarryPotter 7 del 2", "Fantasy");
        bookList[arraynr += 1] = new Item("Solsidan", "Comedy");
    }
}
