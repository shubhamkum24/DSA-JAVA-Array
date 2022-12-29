package PrefixSum;
// Q=> Given an array size N. Construct a prefix array store sum
// of all even indices values from [0,i]
// 3 -2 4 6 -3 5
import java.util.Scanner;

public class EvenIndices {
    static void printArray(int[] a){
        for(int x:a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static int[] evenIndices(int[] a){
        int n=a.length;
        int[] ps=new int[n];
         ps[0]= a[0];
        for(int i=1;i<n;i++){
            if(i%2==0){
                ps[i]=ps[i-1]+a[i];
            }else {
                ps[i]=ps[i-1];
            }
        }
        return ps;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
       int[] ps= evenIndices(arr);
        System.out.println(ps);
        printArray(ps);
    }
}
