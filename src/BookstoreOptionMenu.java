import java.util.Scanner;

public class BookstoreOptionMenu extends BookstoreService{
    Scanner userBookInput = new Scanner(System.in);

    public void getLogin(){
        System.out.println("Welcome to Alpha Bookstore! \n");
        System.out.println("Please enter you user ID & 5 digit pin \n");
        System.out.println("ID: ");
        Scanner userInput = new Scanner(System.in);

        int userID = userInput.nextInt();

        System.out.println("Pin: ");
        int userPin = userInput.nextInt();
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
