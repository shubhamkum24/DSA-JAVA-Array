package PrefixSum;
// Q=> Given with array N element .Find equilibrium index(right Side sum==Left side Sum) index in array
// -7 1 5 2 -4 3 0
import java.util.Scanner;

public class EquilibriumIndex {
    static void printArray(int[] a){
        for(int x: a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static int[] prefixSum(int[] a,int n ){
        int prefix[]=new int[n];
        prefix[0]=a[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        return prefix;
    }
    static int equilibrium(int[] a){
        int n=a.length;
        int prefix[]=prefixSum(a,n);
        for(int i=1;i<=n-2;i++){
            int leftSum=prefix[i-1];
            int rightSum=prefix[n-1]-prefix[i];
            if(leftSum==rightSum)
                return i;

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
       int index=equilibrium(arr);
        System.out.println("Equilibrium Index is " + index);

    }
}
