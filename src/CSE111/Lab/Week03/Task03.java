package CSE111.Lab.Week03;

import java.util.Scanner;

public class Task03 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.printf("%s : %d%n", s.charAt(i), (int)s.charAt(i));
        }
    }
}
