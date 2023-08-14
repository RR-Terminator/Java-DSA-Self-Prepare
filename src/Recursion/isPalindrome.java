package Recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "ab";
        System.out.println(isValid(s,0,s.length()-1));
    }
    public static boolean isValid(String s, int si , int ei){
        if (si > ei) {
            return true;
        }
        if (s.charAt(si) != s.charAt(ei)) {
           return false;
        }
        return isValid(s,si+1,ei-1);
    }
}
