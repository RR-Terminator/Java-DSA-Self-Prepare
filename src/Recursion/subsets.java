//package Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class subsets {
//    public static void main(String[] args) {
//        ArrayList <Integer> list = new ArrayList<>();
//        int [] arr = {1,2,3};
//       // System.out.println(subsetFinder(arr,0,list));
//    }
//
////    static List<List<Integer>> subsetFinder(int [] arr , int index, ArrayList<Integer> list){
////        List<List<Integer>> outer = new ArrayList<>();
////
////        if(index == arr.length-1 ) {
////            outer.add(new ArrayList<>());
////            return outer;
////        }
////        list.add(arr[0]);
////        subsetFinder(arr, index+1,list);
////        subsetFinder(arr,index,list);
////
////        return outer;
////    }
//
//    static ArrayList<Integer> subset(int[]arr , int index, List<Integer> list){
//        if(index == arr.length-1);{
//            list.add(null);
//            return list;
//        }
//         list.add(arr[index]);
//        subset(arr,index+1,list);
//        list.remove(list.size()-1);
//        subset(arr,index+1,list);
//        return list;
//
//    }
//
//}
