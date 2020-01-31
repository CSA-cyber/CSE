package CSE111.Lab.Week04;

public class BreakTest {
    public static void main(String[] args) {
        for (int i = -100; i <100 ; i++) {
            try {
                System.out.println(i);
                int n=0/i;
            }
            catch (ArithmeticException e){
                System.out.println("catch");
            }
            finally {
                System.out.println("Loop Complete");
            }
        }
    }
}
