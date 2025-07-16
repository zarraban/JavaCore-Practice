package collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Hello1");
        StringBuilder stringBuilder2 = new StringBuilder("Hello2");
        StringBuilder stringBuilder3 = new StringBuilder("Hello3");
        StringBuilder stringBuilder4 = new StringBuilder("Hello4");

        StringBuilder[] stringBuilders = {stringBuilder1,stringBuilder2,stringBuilder3,stringBuilder4};

        List<StringBuilder> list= Arrays.asList(stringBuilder1);
        //or
        List<StringBuilder> list1= List.of(stringBuilder1);
    }
}
