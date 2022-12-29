package PrefixSum;
import java.util.Scanner;
// 2 4 -3 1  3 -2 1 -5 7 2
public class SubArraySumZero {

    static void printArray(int[] a){
        for(int x:a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static int[] prefixSum(int[] a,int n){
        int prefix[]=new int[n];
         prefix[0]=a[0];
         for(int i=1;i<n;i++){
             prefix[i]=prefix[i-1]+a[i];
         }
         return prefix;
    }
    static void sumArraySum(int[] a,int n){

        int prefix[]=prefixSum(a,n);
        int sum = 0;
        for( int start=0;start<=a.length;start++) {
            for (int end = start; end <= a.length; end++) {

                if (start == 0)
                    sum = prefix[end] - prefix[start - 1];
                else
                    sum = prefix[end];

            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        int prefix[]=prefixSum(arr,n);
//        printArray(prefix);
//        int start= sc.nextInt();
//        int end= sc.nextInt();
        sumArraySum(arr,n);

    }
}
