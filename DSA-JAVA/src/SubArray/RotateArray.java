package SubArray;
// Q=>Right Rotate Array an Array by K times  => 3 -2 1 4 6 9 8

import java.util.Scanner;

public class RotateArray {
    static  void swapping(int[] arr,int n){
     for(int i=0;i<n/2;i++){
         int temp=arr[i];
         arr[i]=arr[n-i-1];
         arr[n-i-1]=temp;
     }
    }
    static void printArray(int n, int arr[]){
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        swapping(arr,n);
       printArray(n,arr);
        System.out.println();
        System.out.println("Reverse first Sub array");
        int k= sc.nextInt();
        swapping(arr,k);

        printArray(n,arr);
    }
}
