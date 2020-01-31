package CSE111.Lab.Week04;

public class Book {

    private String title;
    private Author author;
    private Double price;

    public Book(String title, Author author, Double price){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        return String.format("Book name : %s\nAuthor name : %s\nPrice : %.2f$", getTitle(), getAuthor(), getPrice());
    }
}
