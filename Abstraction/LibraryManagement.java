import java.util.Scanner;
interface LibraryItems {
    String getTitle();
    String getAuthor();
    int getYear(); 
    boolean isAvailable();     
}

class Book implements LibraryItems{
    String title;
    String author;
    int year; 

    Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
    public boolean isAvailable() {
        
        return title.equalsIgnoreCase("Java Programming");
    }
}

public class LibraryManagement {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter publication year: ");
        int year = sc.nextInt();

        Book book = new Book(title, author, year);

        System.out.println();
        System.out.println("Name of the book: "+book.getTitle());
        System.out.println("Name of the Author: "+book.getAuthor());
        System.out.println("Publication year: "+book.getYear());
        if(book.isAvailable()==true){
            System.out.println("Avaivality: YES");
        }
        else{
            System.out.println();
            System.out.println("Avaivality: NO");
        }

        sc.close();
    }

    
}
