package Recursion;

public class RemoveA {
    public static void main(String[] args) {
        System.out.println(remove("abbbaAaddd",0));
    }



    static String remove(String str, int s){
        if(s>=str.length()-1) return " ";

        if (str.charAt(s) == 'a' ) {
            return remove(str,s+1);
        }
        return str.charAt(s)+remove(str,s+1);

    }
}
