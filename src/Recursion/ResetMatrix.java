package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ResetMatrix {
    public static void main(String[] args) {

//        int[][] arr ={{1,0,1},{1,1,1},{1,1,1,}};
//        makeRowsCols0(arr);
//        System.out.println(Arrays.deepToString(arr));
//        String a = "1010001";
//        String b = "1101";
//        System.out.println(add(a,b));

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        System.out.println(add(a,b));


    }

    public static void makeRowsCols0(int [][] input){
        int col0 = 1;
        int rows = input.length;
        int cols = input[0].length;
        for (int i = 0; i <= rows-1; i++) {
            if (input[i] [0]== 0) {
                col0 = 0;
            }
            for (int j = 1; j < cols; j++) {
                if (input[i][j]==0)
                {
                    input[i][0]=input[0][j]=0;
                }
            }
        }
        for (int i = rows-1; i >=0 ; i--) {
            for (int j = cols-1; j>=1  ; j--) {
                if (input[i][0] == 0 || input[0][j]==0) {
                    input[i][j] = 0;
                }
                if (col0 == 0) {
                    input[i][0] = 0;
                }

            }
        }
    }

    public static String add(String a , String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;

        int carry = 0;
        while (i>=0 || j>=0){{
            int sum = carry;
            if (i>=0 ) {
                sum +=a.charAt(i) - '0';
            }
            if (j>=0 ) {
                sum +=b.charAt(j) - '0';
            }
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }

        }
        if (carry !=0) sb.append(carry);
        return sb.reverse().toString();

    }
}
// 1011110
// 1011110

/*

    Time Complexity : O(N^2)
    Space Complexity : O(N)

    Where N denotes the maximum length of strings from 'FIRST', 'SECOND' and 'THIRD'.

*/


 class Solution {

    public static String amazingStrings(String first, String second, String third) {


        int sizeOfThird = third.length();


        int visited[] = new int[sizeOfThird];

        for (int i = 0; i < first.length(); i++) {


            int temp = 0;


            for (int j = 0; j < sizeOfThird; j++) {


                if ((first.charAt(i) == third.charAt(j)) && (visited[j] == 0)) {
                    visited[j] = 1;
                    temp = 1;
                    break;
                }
            }


            if (temp == 0) {
                return "NO";
            }

        }

        for (int i = 0; i < second.length(); i++) {
            int temp = 0;
            for (int j = 0; j < sizeOfThird; j++) {
                if (second.charAt(i) == third.charAt(j) && visited[j] == 0) {
                    visited[j] = 1;
                    temp = 1;
                    break;
                }
            }

            if (temp == 0) {
                return "NO";
            }
        }


        for (int i = 0; i < sizeOfThird; i++) {

            if (visited[i] == 0) {
                return "NO";
            }
        }

        return "YES";

    }
}
