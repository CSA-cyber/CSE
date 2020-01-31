package CSE111.Lab.Week03;

import java.util.Scanner;

public class Task04 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        int n[]= new int[26];
        for (int i= 0; i<s.length();i++){
            n[(int)s.charAt(i)-65]++;
        }
        for(int i=0;i<n.length;i++){
            System.out.printf("%s which is %d was found %d times%n", ((char)(i+65)), (i+65),n[i]);
        }
    }
}
