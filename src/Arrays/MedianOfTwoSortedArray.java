package Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int [] nums1 ={1,2};

        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length +nums2.length];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i<nums1.length && j <nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }
            else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while(j <nums2.length){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        int mid = arr.length/2;


        System.out.print(arr[mid-1]);

        //System.out.print(Arrays.toString(arr));
        if(arr.length%2 != 0 ){
            return (double) arr[mid];
        }

        double ans = arr[mid] + arr[mid-1];

        return (double) ans/2;




    }
}
