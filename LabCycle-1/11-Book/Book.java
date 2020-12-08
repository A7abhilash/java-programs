import java.util.Date;

public class Book {
    private int id;
    private String title;
    private int cost;
    private int quantity;
    private int total;
    
    public Book(String title,int cost,int quantity){
        this.id=new Date().hashCode();
        this.title=title;
        this.cost=cost;
        this.quantity=quantity;
        this.total=cost*quantity;
    }

    public long getId(){
        return id;
    }

    public void displayBookDetails(){
        System.out.println(id + "\t" + title + "\t\t" + cost + "\t" + quantity + "\t\t" + total);
    }
}
