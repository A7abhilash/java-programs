import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("0.Exit\n1.Add new book\n2.Display Books\nEnter your choice");
            choice = scanner.nextInt();
            switch(choice){
                case 0:break;
                case 1: System.out.println("Enter book title, cost & quantity:");
                        Book newBook = new Book(scanner.next(),scanner.nextInt(),scanner.nextInt());
                        books.add(newBook);
                        System.out.println("New book with id: "+newBook.getId()+" added.");
                        break;
                case 2: if(books.isEmpty()) System.out.println("No book found.");
                        else{
                            System.out.println("ID\t\tTitle\t\tCost\tQuantity\tTotal Price");
                            System.out.println("___________________________________________________________________");
                            for(Book book: books){
                            book.displayBookDetails();
                        }
                        }
                        break;
                default: System.out.println("Enter proper choice");
            }
        }while(choice!=0);
        
    }
}
