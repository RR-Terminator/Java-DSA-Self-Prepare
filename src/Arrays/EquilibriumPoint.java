package Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {

        int [] arr =  {1,3,5,2,2};
        System.out.println(findPoint(arr));

    }

    public static int findPoint(int [] arr){
        if (arr.length == 1) {
            return 1;
        }
        if (arr.length == 2) {
            return -1;
        }

        int [] sum = new int[arr.length];
        sum[0] =arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] =sum[i-1]+arr[i];
        }

        for (int i = 1; i < arr.length -1; i++) {
            int leftSum = sum[i]-arr[i];
            int rightSum = sum[sum.length-1] - sum[i];
            if (rightSum == leftSum) {
                return i+1;
            }
        }
        return -1;


    }
}
