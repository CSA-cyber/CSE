package Assignment;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        in.close();
        StringFunctions b =new StringFunctions(s);
        System.out.print(b.replace("ff","cc"));
    }
}
