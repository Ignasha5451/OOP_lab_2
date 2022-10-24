import java.util.*;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc_N = new Scanner(System.in);
        System.out.print("Input N: ");
        int N;
        if (sc_N.hasNextInt()) {
            N = sc_N.nextInt();
        }
        else {
            System.out.println("Error: wrong input");
            return;
        }
        int C5 = N % 5;
        int C7 = N % 7;
        int C11 = N % 11;
        System.out.println("C5 = " + C5);
        System.out.println("C7 = " + C7);
        System.out.println("C11 = " + C11);

        Scanner sc_number_of_matrix_A_rows = new Scanner(System.in);
        System.out.print("Input number of matrix A rows: ");
        int number_of_matrix_A_rows = sc_number_of_matrix_A_rows.nextInt();

        Scanner sc_number_of_matrix_A_columns = new Scanner(System.in);
        System.out.print("Input number of matrix A columns: ");
        int number_of_matrix_A_columns = sc_number_of_matrix_A_columns.nextInt();

        int [][] matrix_A = new int[number_of_matrix_A_rows][number_of_matrix_A_columns];

        Random random_A = new Random();

        for (int i = 0; i < number_of_matrix_A_rows; i++) {
            for (int j = 0; j < number_of_matrix_A_columns; j++) {
                matrix_A[i][j] = (byte) (1 + random_A.nextInt(10));
                System.out.print(matrix_A[i][j] + "\t");
            }
            System.out.println();
        }

        Scanner sc_number_of_matrix_B_rows = new Scanner(System.in);
        System.out.print("Input number of matrix B rows: ");
        int number_of_matrix_B_rows = sc_number_of_matrix_B_rows.nextInt();

        Scanner sc_number_of_matrix_B_columns = new Scanner(System.in);
        System.out.print("Input number of matrix B columns: ");
        int number_of_matrix_B_columns = sc_number_of_matrix_B_columns.nextInt();

        int [][] matrix_B = new int[number_of_matrix_B_rows][number_of_matrix_B_columns];

        Random random_B = new Random();

        for (int i = 0; i < number_of_matrix_B_rows; i++) {
            for (int j = 0; j < number_of_matrix_B_columns; j++) {
                matrix_B[i][j] = (byte) (1 + random_B.nextInt(10));
                System.out.print(matrix_B[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] matrix_C = new int[number_of_matrix_A_rows][number_of_matrix_B_columns];
        if (number_of_matrix_A_columns == number_of_matrix_B_rows) {
            for (int i = 0; i < number_of_matrix_A_rows; i++) {
                for (int j = 0; j < number_of_matrix_B_columns; j++) {
                    for (int k = 0; k < number_of_matrix_B_rows; k++) {
                        matrix_C[i][j] += matrix_A[i][k] * matrix_B[k][j];
                    }
                }
            }

            System.out.println("Matrix C:");
            for (int i = 0; i < number_of_matrix_A_rows; i++) {
                for (int j = 0; j < number_of_matrix_B_columns; j++) {
                    System.out.print(matrix_C[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        else {
            System.out.println("Error: number of matrix A columns and number of matrix B rows must be the same");
            return;
        }

        /*
        int sum_max = 0;
        for (int j = 0; j < matrix_C[0].length; j = j + 2) {
            int max = matrix_C[0][j];
            for (int i = 0; i < matrix_C.length; i++) {
                if (matrix_C[i][j] > max) {
                    max = matrix_C[i][j];
                }
            }
            System.out.print(max + " ");
            for (int i = 0; i < matrix_C.length; i++) {
                if (matrix_C[i][j] == max) {
                    sum_max += max;
                }
            }
        }
        System.out.println();
        System.out.println("sum_max=" + sum_max);

        System.out.println();

        int sum_min = 0;
        for (int j = 1; j < matrix_C[0].length; j = j + 2) {
            int min = matrix_C[0][j];
            for (int i = 0; i < matrix_C.length; i++) {
                if (matrix_C[i][j] < min) {
                    min = matrix_C[i][j];
                }
            }
            System.out.print(min + " ");
            for (int i = 0; i < matrix_C.length; i++) {
                if (matrix_C[i][j] == min) {
                    sum_min += min;
                }
            }
        }
        System.out.println();
        System.out.println("sum_min=" + sum_min);
        System.out.println(sum_max + sum_min);
        */

        int sum_max = 0, sum_min = 0;
        for (int j = 0; j < matrix_C[0].length; j++) {
            if (j % 2 == 0) {
                int max = matrix_C[0][j];
                for (int i = 0; i < matrix_C.length; i++) {
                    if (matrix_C[i][j] > max) {
                        max = matrix_C[i][j];
                    }
                }
                System.out.print(max + " ");
                for (int i = 0; i < matrix_C.length; i++) {
                    if (matrix_C[i][j] == max) {
                        sum_max += max;
                    }
                }
            }
            else {
                int min = matrix_C[0][j];
                for (int i = 0; i < matrix_C.length; i++) {
                    if (matrix_C[i][j] < min) {
                        min = matrix_C[i][j];
                    }
                }
                System.out.print(min + " ");
                for (int i = 0; i < matrix_C.length; i++) {
                    if (matrix_C[i][j] == min) {
                        sum_min += min;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("sum_max=" + sum_max);
        System.out.println("sum_min=" + sum_min);
        System.out.println(sum_max + sum_min);
    }
}
