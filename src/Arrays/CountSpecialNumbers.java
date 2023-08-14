package Arrays;

public class CountSpecialNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6};
        System.out.println(countSpecialNumbers(3, arr));
    }

    public static int countSpecialNumbers(int N, int arr[]) {

        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (arr[i] % arr[j] == 0) {
                        count++;
                    }
                }
            }
            if(count>=1){
                ans[i] = 1;
            }
        }

        int count = 0;
        for (int i: ans  ) {
            if (i >= 1) {
                count++;
            }
        }
        return count;
    }
}
