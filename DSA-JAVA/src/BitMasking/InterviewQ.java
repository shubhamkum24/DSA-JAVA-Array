package BitMasking;
// Generate a no in which only bits at loc X & Y are set,rest
// everything is 0

import java.util.Scanner;

public class InterviewQ {

    // Brute Force way
    static int getNo(int x,int y){
        int first_No=1<<x;
        int second_no=1<<y;
        System.out.println("First no " + first_No + " Second no " + second_no);
        return first_No+second_no;
    }
    // Simple way
    static int getNum(int x,int y){
        return (1<<x)|(1<<y);
    }
    // Get ith bit
    static int getIthBits(int no,int i){
        return (no >> i)&1;
    }
    static int getIthBit(int n,int i){
        int ans= n&(1<<i);
        if(ans>0){
            return 1;
        }
        return 0;
    }
    static int setIthBit(int no,int i){
       return no|(1<<i);
    }
    static int unsetBit(int no,int i){
        return no & (1>>i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
//        System.out.println(getNum(x,y));
//        System.out.println(getIthBits(x,y));
//        System.out.println(getIthBit(x,y));
        System.out.println("Set ith bit " + setIthBit(x,y));
        System.out.println("Set ith bit " + unsetBit(x,y));
    }
}
