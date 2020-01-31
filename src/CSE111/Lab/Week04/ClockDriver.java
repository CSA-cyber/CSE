package CSE111.Lab.Week04;

public class ClockDriver {
    public static void main(String[] args) {
        Clock clock1 = new Clock(965000);
        Clock clock2 = new Clock(3600);
        //clock2.addClock(clock1);
        System.out.printf("%s",clock1.subtractClock(clock2));
    }
}
