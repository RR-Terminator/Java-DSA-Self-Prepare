package hashmaps.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        String srt = "abcaba";
        System.out.println(partitionstring(srt));
    }

    public static int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count =1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)){
                count++;
                set = new HashSet<>();
            }

                set.add(ch);

        }
        return count;
    }


    public static int partitionstring(String s) {
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen,-1);
        int count = 1, substringStart = 0;

        for (int i = 0; i < s.length(); i++) {
            if (lastSeen[s.charAt(i) - 'a'] >= substringStart) {
                count++;
                substringStart = i;
            }
            lastSeen[s.charAt(i) - 'a'] = i;
        }

        return count;
    }
}
