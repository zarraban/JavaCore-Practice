package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vlad");
        list.add("Lol");

        Object[] arr = list.toArray();
        String[] arr1 = list.toArray(new String[2]);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));


        List<String> list1= List.copyOf(list);

        System.out.println(list1);
    }
}
