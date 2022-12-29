package InterviewQues;

import java.util.Scanner;

// How to print a missing number in array?
// Given an array of length, n-1 consists of elements from range 1 to n. One of the
// elements is missing from the given list. Find the missing number in the given array
// arr[]= 1 2 3 4 6 7 8
public class MissingNo {

    static int missingNo(int[] a){
        int n= a.length;
        int sum1=((n)*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=a[i];
        }
        return sum1 - sum2;
    }
    static int missingNumber(int[] a){
        int n= a.length;
        int sum1=a[0];
        for(int i=1;i<n;i++){
            sum1=sum1^a[i];
        }
        int sum2=1;
        for(int j=2;j<=n+1;j++){
            sum2=sum2^j;
        }
        return sum1^sum2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int missingNo =missingNo(arr);
//        System.out.println("Missing no is " + missingNo);
        System.out.println(missingNumber(arr));
    }
}
