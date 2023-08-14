package Arrays.Sorting;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int [] arr ={1 ,2 ,3 ,5};
        System.out.println(MissingNumber(arr,5));
    }

    static int MissingNumber(int[]  array, int n) {
        int sum1 =n*(n+1)/2;

        int sum2 =0;

        for (int j : array) {
            sum2 += j;
        }

        return sum1-sum2;
    }
}
