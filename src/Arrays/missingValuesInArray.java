package Arrays;

public class missingValuesInArray {
    public static void main(String[] args) {
        int [] A = {1,2,4};
        System.out.println(missingNumber(A,4));

    }

    public static int missingNumber(int A[], int N)
    {
        int sum = 0 ;
        for(int i : A){
            sum+=i;
        }

        int sum_all =( N * (N+1)) / 2;

        return Math.abs(sum_all - sum);
    }
}
