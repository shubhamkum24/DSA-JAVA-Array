package ARRAY2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAY {

    public static ArrayList<ArrayList<Integer>> readArray(){
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        ArrayList<ArrayList<Integer>> arr2d=new ArrayList<>(N);
        for (int i=0;i<N;i++){
            arr2d.add(new ArrayList<>(M));
            for (int j=0;j<M;j++){
                int no= sc.nextInt();
                arr2d.get(i).get(no);
            }
        }
        return arr2d;
    }

    public static void main(String[] args) {

//        ArrayList<ArrayList<Integer>> arr2d=new ArrayList<>();
//        ArrayList<Integer> row1=new ArrayList<>();
//        row1.add(5);
//        row1.add(6);
//        row1.add(7);
//        ArrayList<Integer> row2=new ArrayList<>(Arrays.asList(10,20,22,30));
//        arr2d.add(row1);
//        arr2d.add(row2);
//        arr2d.add(row1);
//        arr2d.get(2).set(0,55);
//        System.out.println(arr2d);

        // Iterate Over the 2d Array
//        for(int i=0;i< arr2d.size();i++){
//            for(int j=0;j<arr2d.get(i).size();j++){
//                System.out.println(arr2d.get(i).get(j));
//            }
//        }
        ArrayList<ArrayList<Integer>> arr2d= readArray();
        for(int i=0;i<arr2d.size();i++){
            for(int j=0;j<arr2d.get(i).size();j++){
                System.out.print(arr2d.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
