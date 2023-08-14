package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }
        int Max = Integer.MIN_VALUE;
        for (int i:list) {
            Max = Math.max(Max,i);
        }
        System.out.println(Max);
    }
}
