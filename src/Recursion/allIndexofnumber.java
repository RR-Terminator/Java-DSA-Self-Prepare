package Recursion;

import java.util.ArrayList;

public class allIndexofnumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,5,3};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(IndexFinder2(arr,3,0));
    }
    static ArrayList<Integer> IndexFinder(int [] arr , int x , int index, ArrayList<Integer> list){



        if (index > arr.length-1) {

            return list;
        }
        if (arr[index] == x) {
            list.add(index);

        }
        return IndexFinder(arr,x,index+1,list);

    }

    static ArrayList<Integer> IndexFinder2(int [] arr , int x , int index){

        ArrayList<Integer> list = new ArrayList<>() ;
        if (index > arr.length-1) {

            return list;
        }
        if (arr[index] == x) {
            list.add(index);

        }
        ArrayList <Integer> smallAns = IndexFinder2(arr,x,index+1);
        list.addAll(smallAns);
        return list;

    }
}
