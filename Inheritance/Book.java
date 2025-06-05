class titleAndauthor {
    String title;
    String author;

    public titleAndauthor(String title, String author){
        this.title=title;
        this.author=author;
    }

    void displayDetails(){
        System.out.println("Title of book is: "+title);
        System.out.println("Author of the book is: "+author);
    }
}

class FictionalBook extends titleAndauthor{
    public FictionalBook(String title, String author){
        super(title, author);
    }
    
}
class NonfictionalBook extends titleAndauthor{
    public NonfictionalBook(String title, String author){
        super(title, author);
    }
    
    
}
class TechnicalBook extends titleAndauthor{
    public TechnicalBook(String title, String author){
        super(title, author);
    }
    
}
public class Book{
    public static void main(String[] args) {
        FictionalBook fiction = new FictionalBook("Harry Potter and the order of Pheonix", "J.K Rowling");
        NonfictionalBook nonfiction = new NonfictionalBook("Saipens", "Yuval Noah Harrari");
        TechnicalBook technical = new TechnicalBook("Effective Java", "Joshua Bloch");
        fiction.displayDetails();
        System.out.println();
        nonfiction.displayDetails();
        System.out.println();
        technical.displayDetails();
    }
}
