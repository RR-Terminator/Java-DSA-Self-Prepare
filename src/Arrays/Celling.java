package Arrays;

public class Celling {
    public static void main(String[] args) {

        int [] arr = {1,4,5,6,8};
        System.out.println(celling(arr,7));

    }


    public static int celling(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int temp = -1;
        while(start <= end){
            // step 1 calculate mid
            int mid = start + (end-start)/2;
            // step 2 compare mid
            // if arr[mid] == tar return mid
            if(arr[mid] == target)
                return mid;

            else if(arr[mid] < target){
              start = mid+1;
            }
            else{
               temp = mid;
               end = mid-1;
            }


        }
        return temp;
    }
}

// start /2 + end-start/2
// 0/2 + 5-0/2 = 0+3 = 3
// start + end /2 = 0+5 /2 = 3
