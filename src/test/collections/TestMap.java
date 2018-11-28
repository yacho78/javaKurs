package test.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Kowalska");
        mapa.put(1,"Kowalska2");
        mapa.put(2,"Suchowierski");
        mapa.put(3,"Testowy");
        mapa.put(4,"Inny");
        mapa.put(5,"Nowak");

        System.out.println(mapa.get(1));
        System.out.println(mapa.size());
        for (Map.Entry<Integer,String> entry: mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        mapa.forEach((k,v)->System.out.println(k + " -> " + v));
    }
}
