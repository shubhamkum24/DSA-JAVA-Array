package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
    static void reverseArray(ArrayList<Integer> list){
        int i=0,j= list.size()-1;
        Integer temp=Integer.valueOf(list.get(i));
        list.set(i, list.get(j));
        list.set(j,temp);
        i++;
        j--;
    }
    public static void main(String[] args) {
       ArrayList<Integer> li=new ArrayList<>();
       li.add(10);
       li.add(20);
        li.add(1);
        li.add(5);
        li.add(2);
        li.add(219);
        System.out.println("Original Array " +li);
//        reverseArray(li);
        Collections.reverse(li);
        System.out.println("Reverse Array " +li);
        Collections.sort(li);
        System.out.println("Ascending Order " +li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println("Descending Order " +li);
    }
}
