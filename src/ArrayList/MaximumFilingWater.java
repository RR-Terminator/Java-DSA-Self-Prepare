package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumFilingWater {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(MaximumWater(list));


    }

    public static int MaximumWater(ArrayList<Integer> list){
        int lp  =0;
        int rp = list.size()-1;
        int MaxWater =  Integer.MIN_VALUE;
        while (lp<rp){
            int waterHeight = Math.min(list.get(lp),list.get(rp));
            int width = rp - lp;
            int CurrentWaterLevel = waterHeight*width;
            MaxWater = Math.max(MaxWater,CurrentWaterLevel);

            if (list.get(lp) < list.get(rp)) {
                lp++;
            }
            else rp--;
            
        }
        return MaxWater;
    }
}
