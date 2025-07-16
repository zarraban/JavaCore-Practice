package collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Vlad");
        list1.add("Oleg");
        list1.add("Mike");

        System.out.println(list1);



        ArrayList<String> list2 = new ArrayList<>();
        list2.add("?");
        list2.add("!");
        list2.add(")");

        list1.addAll(list2);

        System.out.println(list1);
    }
}
