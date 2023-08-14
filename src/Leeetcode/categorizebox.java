package Leeetcode;

public class categorizebox {
    public static void main(String[] args) {

        System.out.println(categorizeBox(10000,1,1,1));

    }

    final static long Dimension = 10000;
    final static long Volume = 1000000000;

    public static String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;


        boolean Bulky = isBulky(length,width,height,mass,volume);
        boolean Heavy = isHeavy(mass);

        if (Bulky && Heavy) {
            return "Both";
        }
        else if (Bulky) {
            return "Bulky";
        }
        else if (Heavy) {
            return "Heavy";
        }
        else {
            return "Neither";
        }






     }

     public static boolean isBulky(int l , int w, int h, int m, long v){
         if (l >= Dimension || w >= Dimension || h>= Dimension || m >= Dimension) {
             return true;
         }
         if (Volume <= v) {
             return true;
         }
         else return false;
     }
     public static boolean isHeavy(int m){
         return m >= 100;
     }


}
