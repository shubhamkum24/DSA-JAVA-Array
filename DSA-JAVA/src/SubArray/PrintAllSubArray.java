package SubArray;

import java.util.Scanner;

public class PrintAllSubArray {
    static void subArray(int[] arr)
    {
        int start,end;
        for(start=0;start<arr.length;start++){
            for(end=start;end<arr.length;end++){
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        subArray(arr);
    }
}
