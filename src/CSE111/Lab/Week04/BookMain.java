package CSE111.Lab.Week04;

public class BookMain {
    public static void main(String[] args) {
        Student john = new Student("John Baggins","19101444", "Kings Landing", 4);
        Student mike = new Student("Mike hunt","18101446", "New York", 3.22);
        Student carol = new Student("Carol Denvers","19121444", "Alabama", 3.5);
        System.out.println(john);
        System.out.println(mike);
        System.out.println(carol);
    }
}
