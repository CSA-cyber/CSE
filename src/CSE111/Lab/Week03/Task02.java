package CSE111.Lab.Week03;

import java.util.Scanner;
public class Task02 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.printf("%s%n", s.charAt(i));
        }
    }
}
