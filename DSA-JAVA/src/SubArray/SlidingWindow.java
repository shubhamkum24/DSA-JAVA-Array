package SubArray;
// Q=>Find the max sub array sum of length k by using of sliding window
import java.util.Scanner;

public class SlidingWindow {
    // Step-I
    static int printKElement(int[] arr,int k){
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n-k;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int sum=printKElement(arr,k);
        int max=sum;
        for(int i=1;i<n-k;i++){
            sum=sum+arr[i+k-1]-arr[i-1];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }

}
