package hashmaps.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Mumbai");
        set.add("Delhi");
        set.add("Hyderabad");
        set.add("Bangalore");
        set.add("Noida");

        for (String s : set) {
            System.out.println(s);
        }


    }
}
