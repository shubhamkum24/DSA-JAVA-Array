package InterviewQues;

import java.util.Scanner;

// Trapping Rain Water
// Given an integer array A[] consisting of N non-negative integers representing
// an elevation map, where the width of each bar is 1.The task is to compute the
// total volume of water that can be trapped after rain.
// 4 2 5 7 4 2 3 6 8 2 3  ans=16
public class TrappingRainWater {
    static int trappingRainWater(int[] a){
        int n=a.length;
        int res=0;
        if(n==0){
            return 0;
        }
        int[] leftMax=new int[n];
        int[] rightMax=new  int[n];
        leftMax[0]=a[0];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],a[i]);
        }
        rightMax[n-1]=a[n-1];
        for(int j=rightMax.length-2;j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1],a[j]);
        }
        for(int x=0;x<n;x++){
            res+=Math.min(leftMax[x],rightMax[x])-a[x];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
       int totalTrapWater= trappingRainWater(arr);
        System.out.println(totalTrapWater);
    }
}
