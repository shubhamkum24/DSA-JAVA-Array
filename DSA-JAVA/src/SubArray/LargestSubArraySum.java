package SubArray;
// Q=> Array Containing N numbers. Find out the largest sum of sub Array.
// 5 -3 2 -7 6 5 8 -4 11 -10 -15   a[]= 2 -3 6 -5 4 2
import java.util.Scanner;

public class LargestSubArraySum {
    static void largestSum(int[] a,int n){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curSum=0;
            for(int j=i;j<n;j++){
                curSum+=a[j];
                maxSum=Math.max(maxSum,curSum);
            }
        }
        System.out.println(maxSum);
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
