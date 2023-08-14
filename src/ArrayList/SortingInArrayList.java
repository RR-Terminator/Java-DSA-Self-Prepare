package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());

        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
