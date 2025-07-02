package generics;

import java.util.ArrayList;


class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        list.add(2);
        list.add(1);

        int a = GenMethod.getSecondElement(list);
        System.out.println(a);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> list){
        return list.get(1);

    }
}
