package ARRAY2D;
// Q=> Given a positive integer n, generate a nxn matrix filled with elements
// from 1 to n^2 in spiral order

import java.util.Scanner;

public class FindElements {
    static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateMatrix(int n){
        int[][] arr=new int[n][n];
        int topRow=0,leftCol=0,bottomRow=n-1,rightCol=n-1;
        int curr=1;
        while (curr<=n*n){
            // topRow=>leftCol to RightCol
            for(int j=leftCol;j<=rightCol && curr<=n*n;j++){
                arr[topRow][j]=curr++;
            }
            topRow++;
            // rightCol=>TopRow to bottomRow
            for(int i=topRow;i<=bottomRow && curr <n*n;i++){
                arr[i][rightCol]=curr++;
            }
            rightCol--;
            // bottomRow=>rightCol to leftCol
            for(int j=rightCol;j>=leftCol && curr <n*n;j--){
                arr[bottomRow][j] =curr++;
            }
            bottomRow--;
            // leftCol=>bottomRow to TopRow
            for(int i=bottomRow;i>=topRow && curr <n*n;i--){
               arr[i][leftCol] =curr++;
            }
            leftCol++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n= sc.nextInt();

        int[][] matrix=generateMatrix(n);
        printMatrix(matrix);
    }
}
