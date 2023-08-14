package Recursion;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        // ways("",4);
        System.out.println(wayslist("",4));
    }

    static void ways(String p , int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            ways(p+i,target-i);
        }
    }

    static ArrayList<String> wayslist(String p , int target){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();


        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(wayslist(p+i,target-i));
        }
        return list;
    }

}
