package Arrays_Two_D;

import java.util.Arrays;
import java.util.Scanner;

public class creating_2DArray {
    public static void main(String[] args) {
        int [] [] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

       // System.out.println(Arrays.deepToString(arr));

    }
    
}
