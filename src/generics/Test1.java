package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 <T extends Number>{
    private final String message;

    public Test1(T number){
        this.message = "Your number is " + number;

    }

    public String getMessage(){
        return message;
    }


}

class Tester1{
    public static void main(String[] args) {
        Test1<Integer> integerTest1 = new Test1<>(1);

        System.out.println(integerTest1.getMessage());

        ArrayList<String> listStrings = new ArrayList<>();
        listStrings.
    }

    public <T extends Number> T getSecond(ArrayList<T> list){
        return list.get(1);
    }
}