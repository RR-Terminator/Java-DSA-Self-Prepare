//package Arrays_Two_D;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class SpiralMatrix {
//    public static void main(String[] args) {
//
//        int [] [] arr = {{1,2,3},{5,6,7},{9,10,11}};
//        Spiral(arr);
//
//    }
//    public static ArrayList<Integer> spiralPrint(int [] [] arr){
//        ArrayList<Integer> list  =new ArrayList<>();
//        int startRow= 0;
//        int startCol = 0;
//        int endRow = arr.length-1;
//        int endCol = arr[0].length-1;
//
//        while (startRow<=endRow && startCol<=endCol){
//            for (int col = startCol; col <=endCol; col++) {
//                list.add(arr[startRow][col]);
//            }
//
//            for (int row = startRow+1; row <= endRow; row++) {
//                list.add(arr[row][endCol]);
//            }
//            for (int col = endCol-1;col>=startCol;col--){
//                if (startRow == endRow) {
//                    break;
//                }
//                list.add(arr[endRow][col]);
//            }
//            for (int row = endRow-1; row >= startRow+1; row--) {
//                if (startCol == endCol) {
//                    break;
//                }
//                list.add(arr[row][startCol]);
//            }
//
//            startCol++;
//            startRow++;
//            endCol--;
//            endRow--;
//
//        }
//        return list;
//
//    }
//
//
//    static void SpiralPrint(int [][] matrix){
//        int startColumn = 0;
//        int startRow = 0;
//        int endingRow = matrix.length-1;
//        int endingCol = matrix[0].length-1;
//
//
//        while (startRow <= endingRow && startColumn <= s)
//
//    }
//
//
//
//
//
//
//
//
//    public static void Spiral(int[] [] matrix){
//        int StartRow = 0;
//        int StartCols = 0 ;
//        int EndRow = matrix.length-1;
//        int EnDCols = matrix[0].length-1;
//        while(StartRow<= EndRow && StartCols<=EnDCols){
//
//            // Printing Top Part
//            for (int col = StartCols; col <= EnDCols  ; col++) {
//                System.out.print(matrix[StartRow][col]+" ");
//            }
//
//            System.out.println();
//
//            // Printing Right Part
//            for (int row = StartCols+1; row <= EndRow ; row++) {
//                System.out.print(matrix[row][EnDCols]+" ");
//            }
//            System.out.println();
//
//            // Printing Bottom Part
//            for (int col = EnDCols-1; col >= StartCols; col--) {
//                if (StartRow == EndRow) {
//                    break;
//                }
//                System.out.print(matrix[EndRow][col]+" ");
//            }
//
//            System.out.println();
//
//            // Printing Left Part;
//            for (int row = EndRow-1;row>=StartRow+1;row--){
//                if (StartCols == EnDCols) {
//                    break;
//                }
//                System.out.print(matrix[row][StartCols]+" ");
//            }
//            System.out.println();
//
//
//            StartRow++;
//            StartCols++;
//            EndRow--;
//            EnDCols--;
//        }
//    }
//
//
//}
