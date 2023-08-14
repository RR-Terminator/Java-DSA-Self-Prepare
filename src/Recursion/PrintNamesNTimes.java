package Recursion;

public class PrintNamesNTimes {

        public static void main(String[] args) {
//            int [] arr = {1,2,3,4};
//            System.out.println(Arrays.toString(arr));
//            ReverseArray(arr,0);
//            System.out.println(Arrays.toString(arr));

            System.out.println(CheckPalindrome("racecar",0));


        }
        static void PrintName(int n){
            if (n == 0) {
                return;
            }
            PrintName(n-1);
            System.out.println(n);

        }
        static int SumOfNNumbers(int n){
            if(n==0) return 1;
            return n*SumOfNNumbers(n-1);

        }
        static void ReverseArray(int[]arr, int si){
            if(si>= arr.length/2) return ;
            int temp = arr[si];
            arr[si] = arr[arr.length-si-1];
            arr[arr.length-si-1] = temp;
             ReverseArray(arr, si+1);

        }

        static boolean CheckPalindrome(String input , int si){
            if(si>=input.length()/2){
                return true;
            }
            if(input.charAt(si) != input.charAt(input.length()-si-1)) return false;
          return  CheckPalindrome(input,si+1);
        }

    }

