package BitMasking;

import java.util.Scanner;

public class CountSetBits {
    // Brute Force
    static void countBits(int n){
        int cnt=0;
        while(n>0){
            int rem=n%2;
            cnt+=rem;
            n=n/2;
        }
        System.out.println("Total set bits is " +cnt);
    }
    // Bitwise way
    static void bitWiseWay(int n){
        int cnt=0;
       while (n>0){
           int last_bit=n&1;
           cnt+=last_bit;
           n=n>>1;
       }
        System.out.println("Total set bits is " +cnt);
    }
    // total no of bits
    static void sumOfBits(int n){
        int sum=0,cnt=0;
        while(n>0){
            int rem=n&1;
            if(rem==1){
                cnt++;
            }
            n=n>>1;

        }
        System.out.println(cnt);
    }
    static int toogleBit(int n,int i){
        int mask=1<<i;
        return n^mask;
    }
    public static void main(String[] args) {
        // Count No of set bits
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i= sc.nextInt();
        System.out.println(toogleBit(n,i));
//        bitWiseWay(n);
//        sumOfBits(n);
//        countBits(n);

    }
}
