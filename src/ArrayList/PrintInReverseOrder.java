package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintInReverseOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
