package PrefixSum;

import java.util.Scanner;

public class GoggleQues {
    static void printArray(int[] a){
        for(int x: a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void array(int[] a,int q,int l,int r,int value){
        while (q<0){
            for(int i=l;i<=r;i++){
                a[l]+=value;
                a[r+1]-=value;
            }
        }
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i< a.length;i++){
            a[i]= sc.nextInt();
        }
        int q= sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int value= sc.nextInt();
        array(a,q,l,r,value);
        int[] pre=prefixSum(a,n);
        printArray(pre);



    }
}
