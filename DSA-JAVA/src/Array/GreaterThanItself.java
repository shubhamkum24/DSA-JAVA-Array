package Array;
//  Q=>Given an array size with size N. count number of elements
//  that have at least 1 element greater
// than itself  arr=[2 5 1 4 8 0 8 1 3 8]

import java.util.Scanner;

public class GreaterThanItself {
    static int findMax(int[] arr) {
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
          if(arr[i]>max)
              max=arr[i];

        }
        int cnt=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==max)
                cnt++;

        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
          int cnt=findMax(arr);
        System.out.print("Total element greater than itself is : ");
        System.out.println(arr.length-cnt);


    }

}
