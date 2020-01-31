package CSE111.Theory.Assignment02;

import java.util.Scanner;

class Worker01{

    public int doubleIt(int x) {
        return 2*x;
    }

    public int calculate(int x, int y, int y1) {
        return x;
    }
}
public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 10;
        int y = 4;
        double z = 1.5;

        Worker01 w = new Worker01();

        System.out.println(w.doubleIt(x)); //20
        System.out.println(w.doubleIt(y)); //8

        int a = add(x,y);
        System.out.println(a); //14

        double e = add(x,z);
        System.out.println(e); //11.5

        double f = add(x,z,y);
        System.out.println(f); //15.5

        int b = multiply(x,y);
        System.out.println(b); //40

        int c = subtract(x,y);
        System.out.println(c); //6

        int d = subtract(y,x);
        System.out.println(d); //6

        System.out.println(w.calculate(x,y,y)); //Result is 10
        System.out.println(w.calculate(y,x,x)); //Result is 4
        System.out.println(makeMeme()); //*genius meme face. When you finally complete one task of this assignment.

    }

    private static String makeMeme() {
        return "░░░░░░░░░░░░░░░░░░░░░░░▄▄▄▄▄▄░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░█▀█▄▄▀▀░░░░░░▀█▄░░░░░░░\n" +
                "░░░░░░░░░░░█▀▀▀▀░░░░░░░░░░░░░░░░▀▄▄▄▄░░\n" +
                "░░░░░░░░░▄▄▀░░░▄█░░░░░░░░░░░░░░░░▄▄██▄░\n" +
                "░░░░░░░░░█░░▄█▀░░▀▀▀▀▀▄▄░░░░░░░▄▄█░▀█░░\n" +
                "░░░░░░░░░█░▄▀░░░░░░░░░░░▀▀▀▀▄▄███░░░▀▄░\n" +
                "░░░░░░░░░▀▄█▄███▄▄░░░▄▄▄▄░░░░▄▀░░░░░░█░\n" +
                "░░░░░░░░░░█▄█▀██▀░░░░█▀▄▄▀░░█░░░░░░░█▀░\n" +
                "░░░░░░░░░██░██▀░░░░░▄█▄███░░█░░░░░░░█░░\n" +
                "░░░░░░░▄▄█▀█▄░░▄▄▄▄░░█░░░░▄▀░░░░░░░█░░░\n" +
                "░░░░░▄▀░░███▄░░▀▀░▀░░░░░▄█▄░░░░░░░█▀░░░\n" +
                "░░░▄▀░░░▄█░█▄▄▄▄▄▄▄░░░░░█▀███░░░░░█░░░░\n" +
                "░░▄▀░░░░░██████▀▀▀█░░░░░░██░█▄▄▄▄▄█░░░░\n" +
                "░█▀░░░░░░██░▄██▀▀██░█░░░▄▀██▀░░░░▀▀▀▄░░\n" +
                "▀▀░░░░░░░█▀██░░▄███░█░░░█▀░░░░░░░░░░░█▄\n" +
                "░░░░░░░░░░▄█▀▀▀██▀░░░░▄▀░░░░░░░░░░░░░▀▀\n" +
                "░░░░░░░░░░▀▄░░░░░░░░▄▀░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░█▄▀▀▀▄▀▀░░░░░░░░░░░░░░░░░░░";
    }

    private static int subtract(int x, int y) {
        return Math.abs(x-y);
    }

    private static int multiply(int x, int y) {
        return x*y;
    }

    public static int add(int x, int y){
        return x+y;
    }

    public static double add(int x, double y){
        return x+y;
    }

    public static double add(int x, int y, double z){
        return x+y+z;
    }

    public static double add(int x, double y, int z){
        return x+y+z;
    }
}