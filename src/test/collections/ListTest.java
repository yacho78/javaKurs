package test.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(0, "c");
        for (String x : list) {
            System.out.println(x);
        }


    }
}
