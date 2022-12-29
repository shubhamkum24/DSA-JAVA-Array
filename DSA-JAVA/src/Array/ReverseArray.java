package Array;

import java.util.Scanner;

// Q => Reverse the whole Array
public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Reverse Array");
       int i=0,j=n-1;
       while (i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
        for(  i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
