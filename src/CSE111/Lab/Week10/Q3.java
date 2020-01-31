package CSE111.Lab.Week10;

class Author {
    private String name, email;
    private boolean isMale;

    public Author(String name, String email, boolean isMale) {
        this.name = name;
        this.email = email;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString(){
        return String.format("%s (%s) at %s", getName(), isMale?'m': 'f', getEmail());
    }
}

class Book {
    private String name;
    private final Author author;
    private double price;
    private int qty;

    Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return this.getName() + " by " + author;
    }
}

public class Q3 {
    public static void main(String[] args) {

    }
}
