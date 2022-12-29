package SubArray;

import java.util.Scanner;

// Q=> Print Starting & ending index of all Sub Array whose length k
// 3 4 2 -1 6 7 8 9 3 2 -1 4

public class PrintIndex {
    static void index(int[] arr,int k){
        for(int i=0;i<=arr.length-k;i++){
                int s=i;
                int e=i+k-1;
            System.out.println(s + " "+e);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        index(arr,k);
    }
}
