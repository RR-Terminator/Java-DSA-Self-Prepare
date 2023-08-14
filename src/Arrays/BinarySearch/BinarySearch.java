package Arrays.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,8));

    }
    static int binarySearch(int [] arr, int target){
        
        int si = 0 ;
        int ei = arr.length-1;
        
        
        while (si<=ei){
            int mid = si+(ei-si)/2;
            if ( arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                si = mid+1;
            }
            else ei =mid+1;
            
        }
        return -1;

    }
}
