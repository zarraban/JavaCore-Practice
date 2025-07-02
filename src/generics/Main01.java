package generics;

import java.util.ArrayList;

public class Main01 {
    public static void main(String[] args) {


        }
        public String getSecondEl(ArrayList<String> list){
        return list.get(1);
        }

        public Integer getSecondEl(ArrayList<Integer> list){
        return list.get(0);
        }
}