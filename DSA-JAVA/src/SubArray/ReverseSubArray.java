package SubArray;

import java.util.Scanner;

public class ReverseSubArray {

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

        int start= sc.nextInt();
        int end= sc.nextInt();

        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
