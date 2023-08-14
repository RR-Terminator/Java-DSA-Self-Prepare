package Arrays;

public class majorityElement_MooreAlgo {
    public static void main(String[] args) {

        int [] arr = {1,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int [] arr){
        int max_ele = arr[0];
        int count  = 1 ;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == max_ele) {
                count++;
            }
            else {
                count--;
                if (count == 0) {
                    max_ele = arr[i];
                    count++;
                }
            }
        }
        //return max_ele;

        // enough for leet code
        //for gfg verify that the found element is majority element

        int c =0;
        for (int i: arr  ) {
            if (i == max_ele) {
                c++;
            }
        }

        if (c > arr.length/2) {
            return max_ele;
        }
        return -1;
    }


}
