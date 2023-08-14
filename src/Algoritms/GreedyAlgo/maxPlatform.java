package Algoritms.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class maxPlatform {
    public static void main(String[] args) {
        double [] arrival = {9.00,9.40,9.50,11.00,15.00,18.00};
        double [] departure = {9.10,12.00,11.20,11.30,19.00,20.00};
        System.out.println(minRequired(arrival,departure));
    }

    public static int minRequired(double[] arrival , double[] departures ){
        int max_platform = 1;
        double [] [] matrix = new double[arrival.length][3];
        for (int i = 0; i < arrival.length; i++) {
            matrix[i][0] = i;
            matrix[i][1] = arrival[i];
            matrix[i][2] = departures[i];
        }
        Arrays.sort(matrix , Comparator.comparingDouble(o -> o[2]));
        double last = matrix[0][2];
        for (int i = 1; i < matrix.length; i++) {

            if (matrix[i][1] >= last) {
                max_platform++;
                last = matrix[i][2];
            }
        }

        return max_platform;
    }
}
