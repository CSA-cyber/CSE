package CSE111.Theory.Assignment01;

import java.util.Scanner;

class Matrix{
    Scanner in=new Scanner(System.in);
    public void  print2D(int a[][]){
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] build(){
        System.out.println("Enter row");
        int r=in.nextInt();
        System.out.println("Enter column");
        int c=in.nextInt();
        int [][]a=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter value of " + (i + 1) + "" + (j + 1));
                a[i][j] = in.nextInt();
            }
        }
        return a;
    }
    public int[][] add2D(int a[][],int b[][]){
        int result [][]= new int [a.length][a[0].length];
        if(a.length==b.length && a[0].length==b[0].length){
            for (int i=0;i<a.length;i++){
                for (int j=0;j<a[0].length;j++){
                    result[i][j]=a[i][j]+b[i][j];
                }
            }
        }
        else
            System.out.println("Matrix sizes are not same");
        return result;
    }
    public int[][] substract2D(int a[][],int b[][]){
        int result [][]= new int [a.length][a[0].length];
        if(a.length==b.length && a[0].length==b[0].length){
            for (int i=0;i<a.length;i++){
                for (int j=0;j<a[0].length;j++){
                    result[i][j]=a[i][j]-b[i][j];
                }
            }
        }
        else
            System.out.println("Matrix sizes are not same");
        return result;
    }
    public int[][] multiply2D(int a[][],int b[][]){
        int result [][]= new int [a.length][b[0].length];
        if(a.length==b[0].length){
            for (int i=0;i<result.length;i++){
                for (int j=0;j<result[0].length;j++){
                    int index=0;
                    int k=0;
                    for (int l=0; l < b.length; l++) {
                        index+=a[i][k++]*b[l][j];
                    }
                    result[i][j]=index;
                }
            }
        }
        else
            System.out.println("Matrixes cannot be multipled");
        return result;
    }
}