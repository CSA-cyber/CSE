package CSE111.Lab.Week09;

import java.util.Scanner;

public class Task06 {
    private static boolean isHappy(int n){
        if (n == 1)
            return true;
        if (n/10 == 0)
            return false;
        int sum = 0;
        while (n > 0){
            sum +=  (n%10) * (n%10);
            n/=10;
        }

        return isHappy(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            System.out.printf("Case #%d: %d is %s", i, n, isHappy(n)?"a Happy number.\n" : "an Unhappy number.\n");
        }
    }
}
