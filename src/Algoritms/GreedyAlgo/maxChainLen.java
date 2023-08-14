package Algoritms.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class maxChainLen {
    public static void main(String[] args) {
        int [] [] arr = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(max(arr));
    }

    public static int max(int [] [] chainPairs){
        Arrays.sort(chainPairs, Comparator.comparingDouble(o -> o[1]));
        System.out.println(Arrays.deepToString(chainPairs));

        int maxLen = 1;

        int lastEnd = chainPairs[0][1];

        for (int i = 0; i < chainPairs.length; i++) {
            if (chainPairs[i][1] >= lastEnd) {
                lastEnd = chainPairs[i][1];
                maxLen++;
            }
        }
        return maxLen;



    }

}
