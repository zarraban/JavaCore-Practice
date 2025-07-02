package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wildcard {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();

        List<Double> list1 = new ArrayList<>();
        list1.add(34.12);
        list1.add(556.8);
        showList(list1);


        List<Object> list2 = new ArrayList<>();
        list2.add(45);
        list2.add("Si");

        showList(list2);
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);

        System.out.println(sum(ar));


    }
    public static void showList(List<?> list){
        System.out.println(list);
    }
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list){
            sum +=num.doubleValue();
        }
        return sum;

    }
}
