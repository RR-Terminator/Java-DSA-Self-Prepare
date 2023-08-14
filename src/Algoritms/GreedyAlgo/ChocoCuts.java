package Algoritms.GreedyAlgo;

import java.util.Arrays;

import java.util.Collections;


public class ChocoCuts {
    public static void main(String[] args) {

        Integer[] verCost = {2, 1, 3, 1, 4};
        Integer[] horCost = {4, 1, 2};
        System.out.println(miniCuts(verCost, horCost));

    }

    public static int miniCuts(Integer[] verCost, Integer[] horCost) {

        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());
        int cost = 0;
        int vc = 1;
        int hc = 1;
        int h = 0;
        int v = 0;

        while (h < horCost.length && v < verCost.length) {
            if (horCost[h] >= verCost[v]) {
                cost += (horCost[h] * vc);
                h++;
                hc++;
            } else {
                cost += (verCost[v] * hc);
                v++;
                vc++;
            }
        }

        while (h < horCost.length) {
            cost += (horCost[h] * vc);
            h++;
            hc++;
        }

        while (v < verCost.length) {
            cost += (verCost[v] * hc);
            v++;
            vc++;
        }
        return cost;

    }


}
