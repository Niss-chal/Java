public class Product {
    private int product_id;
    private String name;
    private double price; 
    private int stock;

    public Product(int product_id, String name, double price, int stock) {
        this.product_id = product_id;
        this.name = name;
        setPrice(price);
        this.stock = stock;
    }

 
    public void setId(int product_id) {
        this.product_id = product_id;      
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

  
    public int getId() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    
    public void printDetails() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock Available: " + stock);
    }

    public void purchase(int quantity) {
        if (quantity <= stock && quantity > 0) {
            stock -= quantity;
            System.out.println("You purchased " + quantity + " item.");
        } else {
            System.out.println("Invalid quantity or not enough stock!");
        }
    }

    public void restock(int add_product) {
        if (add_product > 0) {
            stock += add_product;
            System.out.println("Restocked " + add_product + " item.");
        } else {
            System.out.println("Cannot restock negative quantity.");
        }
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 99999.99, 0);

        p.restock(10);
        p.purchase(2);
        p.printDetails(); 
    }
}