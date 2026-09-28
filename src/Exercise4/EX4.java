package Exercise4;

public class EX4 {

    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48}
        };
        copyContent(matrix);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }

    }


    public static void copyContent(int [][] matrix){
        for (int i=0;i<matrix.length;i++) {
            matrix[i][4] = matrix[i][1];
        }
    }

}
