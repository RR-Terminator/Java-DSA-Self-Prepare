package Recursion;

public class SayDigits {
    public static void main(String[] args) {
        String [] arr = {"Zero","One","two","Three","Four","Five","six","Seven","Eight","Nine"};
        say(412,arr);
    }

    public static void say(int n , String[] arr){
        if (n == 0) {
            return;
        }
        int smallerAns = n %10;
         say(n/10,arr);
        System.out.print(arr[smallerAns] + " ");
    }

}
