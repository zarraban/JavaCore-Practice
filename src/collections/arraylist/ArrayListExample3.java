package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {
    public static void main(String[] args) {
// remove all
        List<String> list = new ArrayList<>();
        list.add("Vlad");
        list.add("Ibragim");
        list.add("Vania");
        list.add("Ivan");

        List<String> list2 = new ArrayList<>();
        list2.add("Vlad");
        list2.add("Ibragim");


        System.out.println(list);

        System.out.println(list.removeAll(list2));

        System.out.println(list);
//retain all

        List<String> list3 = new ArrayList<>();
        list3.add("Vlad");
        list3.add("Ibragim");
        list3.add("Vania");
        list3.add("Ivan");

        List<String> list4 = new ArrayList<>();
        list4.add("Vlad");
        list4.add("Ibragim");


        System.out.println(list3);

        System.out.println(list3.retainAll(list4));

        System.out.println(list3);
    }

}
