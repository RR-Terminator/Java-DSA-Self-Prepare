package Algoritms.GreedyAlgo;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int [] arr = {3,2,2,1};
         System.out.println(numRescueBoats(arr,3));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
}
