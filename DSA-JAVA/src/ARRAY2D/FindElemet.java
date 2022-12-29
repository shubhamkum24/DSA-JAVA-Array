package ARRAY2D;

import java.util.Scanner;

public class FindElemet {
    public static boolean search(int[][] arr,int key){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i][j]==key){
                    System.out.println("Element Found at (" + i + "," +j+")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int key= sc.nextInt();
        search(arr,key);
    }
}
