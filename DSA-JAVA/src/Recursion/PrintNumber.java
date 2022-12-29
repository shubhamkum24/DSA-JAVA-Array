package Recursion;
// Q=> Print N Natural Number
import java.util.Scanner;

public class PrintNumber {
    static void printIncreasing(int n){
        // base case
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }
    static void decreasing(int n){
        // base work
        if(n==1){
            System.out.println(n);
            return;
        }
        // self work
        System.out.println(n);
        // recursive work
        decreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
//        printIncreasing(n);
        decreasing(n);
    }
}
