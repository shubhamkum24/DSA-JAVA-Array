package ARRAY2D;
// Q=>Rotate Matrix by 90' clockwise direction
import java.util.Scanner;

public class ClockWiseMatrix {
    static void printMatrix(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeMatrix(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i=0;int j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix(int[][] arr,int n){
        // transpose
        transposeMatrix(arr,n,n);
        // reverse each row transposed matrix
        for(int i=0;i<n;i++){
            reverseArray(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(arr);
        System.out.println("Rotate by 90' Matrix");
        rotateMatrix(arr,r);
        printMatrix(arr);
    }
}
