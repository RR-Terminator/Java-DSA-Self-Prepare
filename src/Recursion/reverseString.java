package Recursion;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(Reverse("R"));
    }
    public static String Reverse (String str){

        if (str == null || str.length()<=1) {
            return str;
        }
        return Reverse(str.substring(1))+str.charAt(0);

    }

 




}
