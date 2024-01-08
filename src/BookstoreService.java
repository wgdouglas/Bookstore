import java.text.DateFormat;
import java.util.Scanner;

public class BookstoreService {

    private static String bookTitle;
    private static String bookAuthor;
    private static int bookRating;

    Scanner userBookInput = new Scanner(System.in);

//    DateFormat bookPublishingDate = DateFormat.getDateInstance(DateFormat.DAY_OF_YEAR_FIELD);

    public static String getBookTitle() {
        return bookTitle;
    }

    public static String getBookAuthor() {
        return bookAuthor;
    }

    public static int getBookRating() {
        return bookRating;
    }


    public static String searchBookTitle(String newBookName){
        bookTitle += newBookName;
        return bookTitle;
    }
}
