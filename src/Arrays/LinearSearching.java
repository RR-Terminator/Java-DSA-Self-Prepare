package Arrays;

public class LinearSearching {

    public static void main(String[] args) {
        int [] arr = {1,4,52,34,53,23};
        System.out.println(linearSearch(arr,23));
    }
    public static int linearSearch(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
