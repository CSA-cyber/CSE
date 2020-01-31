package CSE111.Lab.Week04;

public class Task15Test {
    public static void main(String[] args) {
        BoroInt a = new BoroInt("10");
        BoroInt b = new BoroInt("30");

        b= b.add(a);
        System.out.printf("%s",b.num);
    }
}
