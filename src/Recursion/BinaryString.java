package Recursion;

public class BinaryString {
    public static void main(String[] args) {

        BinaryPrinting(3,0,"");

    }
    public static void BinaryPrinting(int n , int lastPosition , String str){
        if (n == 0) {
            System.out.println(str);
            return;
        }
        BinaryPrinting(n-1,0,str+"0");
        if (lastPosition == 0) {
            BinaryPrinting(n-1,1,str+"1");
        }
    }
}
