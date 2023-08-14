package Queue;


import java.util.LinkedList;

public class TicketTime {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2,1};
        System.out.print(timeRequiredtoBuy(arr, 2));

    }

    public static int timeRequiredToBuy(int[] tickets, int k) {

        int count = 0;

        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    count++;
                    tickets[i]--;
                }

                if (i == k && tickets[k] == 0) {
                    break;
                }
            }

        }

        return count;
    }
    public static int timeRequiredtoBuy(int[] tickets, int k) {
        int timeTaken = 0;
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] <= tickets[k]){
                timeTaken += tickets[i];
            }
            else  timeTaken += tickets[k];
            if(i > k && tickets[i] >= tickets[k])  timeTaken--;
        }

        
        return timeTaken;



    }


}


