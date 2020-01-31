package CSE111.Lab.Week03;

import java.util.Scanner;

public class Task06 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.printf("%s%n", s);
        System.out.printf("%s\n", s.concat("==THE END=="));
        System.out.printf("%s%n", s);

    }
}
