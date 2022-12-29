package PrefixSum;
// Q=> You need to tell for every array element => it's right maximum element
// arr[]= 4 2 9 1 8 5 6 3

import java.util.Scanner;

public class RightMaximum {
    static void rightMax(int[] a){
        int i,maximum=0;
        for(i=a.length-1;i>=0;i--){   // to tell every right most element is do one change like
            if(a[i]>maximum)          // just add one line code
                                           //  sout(arr[i] + " ")
            maximum=a[i];
        }// this is the rightmost element of total array
        System.out.println(maximum);
    }
    static void leftMax(int[] a){
        int n= a.length;
        int[] left=new int[n];
        left[0]=a[0];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1],a[i]);
            System.out.println(left[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        rightMax(arr);
        leftMax(arr);
    }

}
