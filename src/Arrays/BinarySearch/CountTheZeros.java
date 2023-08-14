package Arrays.BinarySearch;

public class CountTheZeros {
    public static void main(String[] args) {
        int [] ar = {0, 0, 0, 0, 0};
        System.out.println(countZeroes(ar, ar.length));
    }

    static int  countZeroes(int[] arr, int n) {
        int num_zeros = BinarySearch(arr,n);

        return n - num_zeros ;
    }


     static  int BinarySearch(int[] arr, int n){
        int s = 0 ;
        int e = n-1;
        int ans = 0 ;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid] == 0){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}
