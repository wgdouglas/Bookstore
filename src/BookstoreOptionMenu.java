import java.util.Scanner;

public class BookstoreOptionMenu extends BookstoreService{
    Scanner userBookInput = new Scanner(System.in);

    public void getLogin(){


    }

    public void getUserBookSearch(){


    }

    public void getSavedBooksList(){
        System.out.println("Enter 1: Book's you've already read from your list");
        System.out.println("Enter 2: Unread book's from your list");
        System.out.println("Enter 3: Exit");

    }

    public void getNewBookArrivals() {
        System.out.println("Enter 1: Most popular new reads");
        System.out.println("Enter 2: Last month's new books");
        System.out.println("Enter 3: Exit");

    }
}
