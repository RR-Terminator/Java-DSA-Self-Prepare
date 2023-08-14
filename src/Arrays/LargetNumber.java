package Arrays;

public class LargetNumber {
    public static void main(String[] args) {
        int [] arr = {1,4,52,34,53,23};
        System.out.println(Largest(arr));
    }

    public static int Largest(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max =arr[i];
            }
        }
        return max;
    }

}
