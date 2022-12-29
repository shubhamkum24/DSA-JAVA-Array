package ARRAY2D;

import java.util.Scanner;

public class PrintSpiral {
    static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] arr, int r, int c){
        int topRow=0, bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElements=0;
        while(totalElements<r*c){
            // topRow=>leftCol to RightCol
            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // rightCol=>TopRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
                System.out.print(arr[i][rightCol]+ " ");
                totalElements++;
            }
            rightCol--;
            // bottomRow=>rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            // leftCol=>bottomRow to TopRow
            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row & Col");
        int r= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Enter Elements");
        int[][] arr=new int[r][c];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Sprial Order");
        printSpiralOrder(arr,r,c);
//        printMatrix(arr);

    }
}
