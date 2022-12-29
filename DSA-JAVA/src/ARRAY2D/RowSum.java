package ARRAY2D;
// Q=> Row Sum & Col Sum
import java.util.ArrayList;
import java.util.Scanner;

public class RowSum {
    public static void rowSum(int[][] arr){
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=0;j< arr.length;j++){
                sum=sum+arr[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
    public static void colSum(int[][] arr){
        for(int j=0;j< arr.length;j++) {
            int sum=0;
            for(int i=0;i< arr.length;i++){
                sum=sum+arr[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
    public static void mul(int[][] a,int b ){
        int mul=0;
        for(int i=0;i< a.length;i++){
            for(int j=0;j< a.length;j++){
                mul=b*a[i][j];
                System.out.print(mul + " ");
            }
            System.out.println();
        }
    }
    static void printArray(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j< a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[][] arr=new int[N][M];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
//        System.out.println("Row sum");
//        rowSum(arr);
//        System.out.println("Col sum");
//        colSum(arr);
        int b= sc.nextInt();
        System.out.println("Mul");
        mul(arr,b);
//        printArray(arr);
    }
}
