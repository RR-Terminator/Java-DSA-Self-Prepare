package Arrays_Two_D;

import java.util.Arrays;

public class MakeZero {
    public static void main(String[] args) {
        int [] [] arr = {{1, 2, 3, 4},
                {5, 6, 0, 7},
                {8, 9, 4, 6},
                {8, 4, 5, 2}};
        MakeZeros(arr);
    }

    public static void  MakeZeros(int[][] matrix)
    {

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] temp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (temp[i][j] == 0) {
                    if (i-1 >= 0) {
                        matrix[i][j] += temp[i-1][j];
                        matrix[i-1][j] = 0;
                    }
                    if (i+1 < row) {
                        matrix[i][j] += temp[i+1][j];
                        matrix[i+1][j] = 0;
                    }
                    if(j-1 >=0){
                        matrix[i][j] +=temp[i][j-1];
                        matrix[i][j-1] =0;
                    }
                    if (j+1 < col) {
                        matrix[i][j] += temp[i][j+1];
                        matrix[i][j+1] = 0;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));


    }
}
