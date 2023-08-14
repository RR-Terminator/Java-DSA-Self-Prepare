package Arrays;

import java.util.Arrays;

public class CharacterArray {
    public static void main(String[] args) {

        int [] arr = new int [26];
        String str = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
