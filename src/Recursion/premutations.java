package Recursion;


import java.util.ArrayList;

public class premutations {

    public static void main(String[] args) {
       ArrayList <String> list =Permutationslist("","abcd");
        System.out.println(list);
        Permutations("","abc");
        System.out.println(PermutationsCount("","abc"));
    }
    static void Permutations (String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            Permutations(f+ch+s,up.substring(1));
        }

    }

    static ArrayList<String> Permutationslist (String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           list.addAll( Permutationslist(f+ch+s,up.substring(1)));
        }
        return list;

    }


    static int PermutationsCount (String p , String up){
        if (up.isEmpty()) {

            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + PermutationsCount(f+ch+s,up.substring(1));
        }
        return count;

    }

}
