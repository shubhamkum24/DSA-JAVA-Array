package Array;
// Q=> Array Size NO Count no of pair (i,j) such that arr[i]+arr[j]==K
// K=10  arr=[3 5 2 1 -3 7 8 15 6 13], K=20 arr=[2 7 3 14 6 1 0 10 14]
import java.util.Scanner;

public class PairSums {
    static void pairSum(int[] arr,int k){
        int cnt=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==k){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        pairSum(arr,k);
    }
}
