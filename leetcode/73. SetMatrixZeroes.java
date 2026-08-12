import java.util.Scanner;

class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        boolean zeroInFirstCol = false;

        for (int row = 0; row < matrix.length; row++) {

            if (matrix[row][0] == 0) {
                zeroInFirstCol = true;
            }

            for (int col = 1; col < matrix[0].length; col++) {

                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for (int row = matrix.length - 1; row >= 0; row--) {

            for (int col = matrix[0].length - 1; col >= 1; col--) {

                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }

            if (zeroInFirstCol) {
                matrix[row][0] = 0;
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter rows: ");
            int rows = sc.nextInt();

            System.out.print("Enter columns: ");
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Enter matrix elements:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            setZeroes(matrix);

            System.out.println("Matrix after setting zeroes:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}