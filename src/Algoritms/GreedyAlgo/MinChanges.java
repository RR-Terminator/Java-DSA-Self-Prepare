package Algoritms.GreedyAlgo;

public class MinChanges {

    static int [] Currency = {2000,500,100,50,20,10,5,2,1};

    public static void main(String[] args) {
        System.out.println(changes(590));
    }

    public static int changes(int value){
        int min = 0;

        for (int i = 0; i < Currency.length; i++) {
            if (Currency[i] <= value) {
                while(Currency[i]<= value){
                    value-=Currency[i];
                    min++;
                }
            }
        }

        return min;
    }


}
