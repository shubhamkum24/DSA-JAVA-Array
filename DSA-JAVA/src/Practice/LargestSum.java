package Practice;
// Q=> The Largest sum of sub array
// 7 -5 2 6 -19 10 12 -4 ans=22
// -7 10 -5 2 6 8 -4 1 2
import java.util.Scanner;

public class LargestSum {
    static void largestSum(int[] a,int n){
        int largest=Integer.MIN_VALUE;
        int cumSum=0;
        for(int i=0;i<n;i++){
            cumSum+=a[i];
            if(cumSum<0){
                cumSum=0;
            }
            if(cumSum>largest){
                largest=cumSum;
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        largestSum(arr,n);
    }
}
