package Strings;

public class LastIndexOfOne {
    public static void main(String[] args) {
        System.out.println(lastIndex("00001"));
            }
    public static int lastIndex( String s) {

        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i) == '1') {
                return i;
            }
        }
        return -1;

    }
}
