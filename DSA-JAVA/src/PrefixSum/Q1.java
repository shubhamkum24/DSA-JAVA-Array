package PrefixSum;
// Q=> Build the prefix sum array
// -3 6 2 4 5 2 8 -9 3 1
import java.util.Scanner;

public class Q1 {
    // Function to print the array.
    static void printArray(int[] a) {
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }
    static int[] findPrefixSum(int[] a,int n){
        // Defining the prefix sum array
        int prefix[]=new int[n];
        // Assigning a[0] to prefixSum[0]
        prefix[0]=a[0];
        // Iterating from i=1 to t=n-1;
        for(int i=1;i<n;i++){
            // Calculating and assigning the value of prefix[i]
            prefix[i]=prefix[i-1]+a[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Prefix Sum Array is");
        int prefix[]=findPrefixSum(arr,n);
        printArray(prefix);
    }
}
