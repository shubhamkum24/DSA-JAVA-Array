package SubArray;
// Q=> Find the max sum of sub array sum whose length is k
// -3 4 -2 5 3 -2 8 2 -1 4  k=5

import java.util.Scanner;

public class MaxSubArraySum {
    static void maxSum(int[] arr,int k){
        int max=0;
        for(int i=0;i<=arr.length-k;i++){
            int s=i;
            int e=i+k-1;
            int sum=0;
            for(int j=s;j<=e;j++){
                sum+=arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.print("max sum of sub array is : ");
        maxSum(arr,k);
    }
}
