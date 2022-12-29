package SubArray;
import java.util.Arrays;


public class KTimes {

    static int test_arr[] = new int[]{1, 2, 3, 4, 5};

        // Method for rotation
        static void rotate()
        {
            int x = test_arr[0];
            for(int i=1; i<test_arr.length; i++){
                test_arr[i-1] = test_arr[i];
            }
            test_arr[test_arr.length-1] = x;
        }

        public static void main(String[] args)
        {
            System.out.println("Given Array is");
            System.out.println(Arrays.toString(test_arr));

            rotate();

            System.out.println("Rotated Array is");
            System.out.println(Arrays.toString(test_arr));
        }
    }
