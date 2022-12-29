package ArrayList;

import java.util.ArrayList;

public class BasicQues {
    public static void main(String[] args) {
//        Integer j =Integer.valueOf(10);
//        System.out.println(j);

        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Boolean> bo=new ArrayList<>();
        li.add(5);
        li.add(6);
        li.add(8);
        li.add(7);
        System.out.println(li.get(0));

        // Print Arraylist with loop
//        for(int i=0;i<li.size();i++){
//            System.out.println(li.get(i));
//        }
        // Print ArrayList directly
        System.out.println(li);

        // adding element at some index at i
        li.add(1,100);
        System.out.println(li);

        // Modifying element at index i
        li.set(1,10);
        System.out.println(li);
        // Remove element at index i
        li.remove(1);
        System.out.println(li);
        // Remove element e
        li.remove(Integer.valueOf(6));
        System.out.println(li);

        // Check if element is present
        boolean ans=li.contains(Integer.valueOf(7));
        System.out.println(ans);

        // if you don't put specify class you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("Shubh");
        l.add(1);
        l.add(true);
        System.out.println(l);

        System.out.println(l);

    }
}
