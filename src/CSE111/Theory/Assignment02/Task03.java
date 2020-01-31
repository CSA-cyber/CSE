package CSE111.Theory.Assignment02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] x = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] y = {{1,2,3},{4,5,6},{7,8,9}};

        print(x); //{{1,1,1},{2,2,2},{3,3,3}}
        print(y); //{{1,2,3},{4,5,6},{7,8,9}}

        swap(x,y);

        print(x); //{{1,2,3},{4,5,6},{7,8,9}}
        print(y); //{{1,1,1},{2,2,2},{3,3,3}}

        int[][] z = {{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}};

        int a[][] = reverseRow(z);

        print(z); //{{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}}
        print(a); //{{7,7,7},{6,6,6},{5,5,5},{4,4,4},{3,3,3},{2,2,2},{1,1,1}};

        int b[][] = join(x,y);

        print(b); //{{1,2,3},{4,5,6},{7,8,9},{1,1,1},{2,2,2},{3,3,3}}
    }

    private static int[][] join(int[][] x, int[][] y) {
        int a[][] = new int[x.length+y.length][x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                a[i][j]=x[i][j];
            }
        }
        for (int i = x.length; i <a.length ; i++) {
            for (int j = 0; j <y[0].length; j++) {
                a[i][j]=y[i-x.length][j];
            }
        }
        return a;
    }

    private static int[][] reverseRow(int[][] z) {
        int temp[][] = copy(z);
        int a[]= new int[z[0].length];
        for (int i = 0; i < temp.length/2 ; i++) {
            a=temp[i];
            temp[i]=temp[temp.length-i-1];
            temp[temp.length-i-1] = a;
        }
        return temp;
    }

    private static int[][] copy(int [][]x){
        int a[][]=new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                a[i][j]=x[i][j];
            }
        }
        return a;
    }
    private static void swap(int[][] x, int[][] y) {
        int a[][]=new int[x.length][x[0].length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                a[i][j]=x[i][j];
            }
        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j <y[0].length ; j++) {
                x[i][j]=y[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                y[i][j]=a[i][j];
            }
        }
    }

    private static void print(int[][] x) {
        System.out.printf("{");
        for (int i = 0; i <x.length ; i++) {
            System.out.printf("{");
            for (int j = 0; j <x[0].length ; j++) {
                if(j!=x[0].length-1)
                    System.out.printf("%d,",x[i][j]);
                else
                    System.out.printf("%d",x[i][j]);
            }
            if (i!=x.length-1)
                System.out.printf("},");
            else
                System.out.printf("}");
        }
        System.out.printf("}");
        System.out.printf("\n");
    }
}
