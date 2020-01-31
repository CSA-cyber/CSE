package CSE111.Lab.Week04;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("George RR","Martin");
        Book book = new Book("Game of Thrones", author,50.00);
        System.out.println(book);
    }
}
