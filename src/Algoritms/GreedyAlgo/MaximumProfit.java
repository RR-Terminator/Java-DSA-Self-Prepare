package Algoritms.GreedyAlgo;

import java.util.ArrayList;

public class MaximumProfit {
    public static void main(String[] args) {
        int [][] arr = {{4,5},{1,30},{1,60},{1,10}};
        System.out.print(GainMax(arr));

    }

    public static ArrayList<Integer> GainMax(int[][] projects){
        ArrayList<job> list = new ArrayList<>();

        for (int i = 0; i < projects.length; i++) {
            list.add(new job(i,projects[i][0],projects[i][1]));
        }

        list.sort((a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < list.size(); i++) {
            job curr = list.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        return seq;

    }

    public static class job{
        int id;
        int deadline;
        int profit;

        public job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
}
