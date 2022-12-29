package BitMasking;

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueNum {

    static void uniqueNumber3(){
        int[] arr = {2,2,4,3,4,4,7,7,7,6,6,6,2};
        int freq[] = new int[32]; //default value is 0

        for(int x : arr){
            // Remove the bits of x and update the freq array
            int j = 0;
            while(x>0){
                int last_bit = (x&1);
                freq[j] += last_bit;
                j = j + 1;
                x = x >> 1;
            }
        }
        // next step
        int ans = 0;
        int p = 1;

        for(int i=0; i<=31; i++){
            freq[i] = freq[i]%3; //removes contribution of numbers repeating thrice
            // binary to decimal
            ans = ans + freq[i]*p;
            p = p<<1; // p = p*2
        }
        // generate a number
        System.out.println(ans);
        System.out.println(Arrays.toString(freq));
    }
    public static void main(String[] args) {
        uniqueNumber3();
    }
}
