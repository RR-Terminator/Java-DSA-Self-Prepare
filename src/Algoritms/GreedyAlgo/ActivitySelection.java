package Algoritms.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {

//        int [] start = {1,3,0,5,8,5};
//
//        int [] end = {2,4,6,7, 9,9};

        int [] start = {5,8,5,0,3,1};
        int [] end = {9,9,7,6,4,2};
       // Arrays.sort(start);

        System.out.println(maxActivity2(start,end));

    }

    // End is sorted :-
    public static int maxActivity(int [] start , int[] end){
        int count = 1;
        int lastActivity = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastActivity) {
                count++;
                lastActivity = end[i];
            }
        }
        return count;
    }
    
    // End Time is sorted

    public static int maxActivity2(int [] start , int[] end){
        
        int [][] matrix = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            matrix[i][0] = i;
            matrix[i][1] = start[i];
            matrix[i][2] =end[i];
        }

        Arrays.sort(matrix , Comparator.comparingDouble(o -> o[2]));
        System.out.println(Arrays.deepToString(matrix));


        int count = 1;
        int lastActivity = matrix[0][2];

        for (int i = 1; i < end.length; i++) {
            if (matrix[i][1] >= lastActivity) {
                count++;
                lastActivity = matrix[i][2];
            }
        }
        return count;
    }

}
