public class Book {

    private String book_title;
    private String author_name;
    private int publication_year;
    private Boolean availability;

    public Book(String author_name, String book_title, int publication_year, Boolean availability) {
        this.author_name = author_name;
        this.book_title = book_title;
        this.publication_year = publication_year;
        this.availability = availability;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getBook_title() {
        return book_title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void availabilityStatus() {
        if (availability) {
            System.out.println("You can borrow the book");
        } else {
            System.out.println("Sorry! It's unavailable this time");
        }
    }

    public void printDetails() {
        System.out.println("Book Title: " + book_title);
        System.out.println("Author Name: " + author_name);
        System.out.println("Publication Year: " + publication_year);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book bk = new Book("J.K. Rowling", "Harry Potter and the Half Blood Prince", 2005, true);
        bk.printDetails();
        bk.availabilityStatus();
    }
}
