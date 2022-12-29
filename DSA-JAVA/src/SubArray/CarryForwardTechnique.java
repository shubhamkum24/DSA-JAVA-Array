package SubArray;
// Q=>Print all possible sub array sum
// 3 -2 4 -1 2 6
import java.util.Scanner;

public class CarryForwardTechnique {
    static void subArraySum(int[] arr){
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=arr[j];
                System.out.println(sum);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        subArraySum(arr);
    }
}
