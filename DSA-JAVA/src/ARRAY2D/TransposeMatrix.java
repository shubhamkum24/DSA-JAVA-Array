package ARRAY2D;
// Q=>Transpose of Matrix
import java.util.Scanner;

public class TransposeMatrix {
    static void printMatrix(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] arr,int r,int c){
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static void inPlace(int[][] arr,int r,int c){
        for(int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                // Swapping
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows & Cols");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] mat=new int[r][c];
        int totalEle=r*c;
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat.length;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(mat);
        System.out.println("Transpose Matrix");
//        int[][] matrix=findTranspose(mat,r,c);
        inPlace(mat,r,c);
        printMatrix(mat);
    }
}
