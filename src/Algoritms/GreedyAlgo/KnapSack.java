package Algoritms.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class KnapSack {
    public static void main(String[] args) {
        int [] values = {10, 30, 20, 40, 50};
        int [] weight = {5, 10, 15, 20, 25};

        System.out.println(findMax(weight,values,10));
    }

    public static int findMax(int [] weights, int [] values, int Weight){

        double [] [] ratio = new double [values.length][2];

        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double)weights[i];
        }

        System.out.println(Arrays.deepToString(ratio));



        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        System.out.println(Arrays.deepToString(ratio));

        int capacity = Weight;
        int finalans = 0;
        for (int i = ratio.length-1; i >=0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weights[idx]) {
                finalans +=values[idx];
                capacity-=weights[idx];
            }
            else  {
                finalans +=  ratio[i][1]*capacity;
                capacity =0 ;
                break;
            }
        }
        return finalans;




    }
}
