import java.util.Scanner;

public class User {
    Scanner myScanner = new Scanner(System.in);
    Books books = new Books();

    public void readListOfBooks() {

        //här ska metod för att läsa upp alla böcker


        System.out.println("Vill du låna en bok? 1 = ja/ 2 = nej");
        int alt = myScanner.nextInt();

        while (true) {
            if (alt == 1) {

                books.lentOutBooks();
                break;
            } else if (alt == 2) {
                break;
            } else {
                System.out.println("svara med ja eller nej");
            }
        }
    }

    public void borrowBook() {
        System.out.println("");


        int alt = myScanner.nextInt();
        boolean whileIsTrue = true;
        while (whileIsTrue == true) {

            try {

                if (alt == 1) {

                } else if (alt == 2) {

                }


            } catch (Exception e) {
                System.out.println("You can only write numbers");
            }
        }
    }

}
