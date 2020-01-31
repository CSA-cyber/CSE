package CSE111.Theory.Assignment01;

import java.util.Scanner;

public class Driver {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        Matrix matrix=new Matrix();
        int[][] a = matrix.build();
        int[][] b = matrix.build();
        int[][] sum = matrix.add2D(a,b);
        int[][] sub = matrix.substract2D(a,b);
        int[][] mul = matrix.multiply2D(a,b);
        System.out.printf("Addition of a & b : %n");
        matrix.print2D(sum);
        System.out.printf("Substracion of a & b : %n");
        matrix.print2D(sub);
        System.out.printf("Multiplication of a & b : %n");
        matrix.print2D(mul);
    }
}
