package Recursion;

import java.util.ArrayList;

public class StringSubsequence {
    public static void main(String[] args) {
       // subSeq("" ,"abc");
        ArrayList <String> list = new ArrayList<>();
        System.out.println(subSeqRet2("", "abc",list));
        System.out.println(subSeqRet("","abc"));
        System.out.println(subSeqRetAscii("","abc",list));
    }
    static void subSeq(String p , String u){
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch  = u.charAt(0);
        subSeq(p+ch, u.substring(1));
        subSeq(p,u.substring(1));

    }

    //subsequence using ArrayList Declaring inside the function body.
    static ArrayList <String> subSeqRet(String p , String u){
        if (u.isEmpty()) {
            ArrayList<String> list  =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch  = u.charAt(0);
        ArrayList<String> left = subSeqRet(p+ch, u.substring(1));
        ArrayList<String>Right = subSeqRet(p,u.substring(1));
        left.addAll(Right);
        return left;

    }

    // subsequence using arraylist Declaring inside the function Argument
    static ArrayList <String> subSeqRet2(String p , String u ,ArrayList<String>list){
        if (u.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch =  u.charAt(0);
        subSeqRet2(p+ch,u.substring(1),list);
        return subSeqRet2(p,u.substring(1),list);


    }
    static ArrayList <String> subSeqRetAscii(String p , String u ,ArrayList<String>list){
        if (u.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch =  u.charAt(0);
        subSeqRetAscii(p+ch,u.substring(1),list);
        subSeqRetAscii(p+(ch+0),u.substring(1),list);
        return subSeqRetAscii(p,u.substring(1),list);


    }

}
