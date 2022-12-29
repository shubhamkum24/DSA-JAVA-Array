package BitMasking;

import java.util.Scanner;

public class BitBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n>>2 & 1);
        System.out.println(n<<2);
    }
}
