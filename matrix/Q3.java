package matrix;

import java.util.Scanner;

public class Q3 {

    public static void printMatrix(int[][] mtrx) {
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                System.out.print("|");
                System.out.print(mtrx[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void recieveMatrix(int[][] mtrx) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                mtrx[i][j] = in.nextInt();
            }
        }
    }

    public static int sumCells(int[][] mtrx) {
        int sum = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                sum += mtrx[i][j];
            }
        }
        return sum;
    }

    public static void a(int[][] mtrx) {
        int sum = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                sum += mtrx[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    public static void b(int[][] mtrx) {
        int sum = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                sum += mtrx[j][i];
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    public static int c(int[][] mtrx) {
        int frameSum = 0;
        for (int i = 0; i < mtrx[0].length; i++) {
            frameSum += mtrx[0][i];
        }
        for (int i = 0; i < mtrx.length - 2; i++) {
            frameSum += mtrx[i + 1][0];
            frameSum += mtrx[i + 1][mtrx[i].length - 1];
        }
        for (int i = 0; i < mtrx[mtrx.length - 1].length; i++) {
            frameSum += mtrx[mtrx.length - 1][i];
        }
        return frameSum;
    }

    public static int d(int[][] mtrx) {
        int diagonalSum = 0;
        for (int i = 0; i < mtrx.length; i++) {
            diagonalSum += mtrx[i][i];
        }
        return diagonalSum;
    }

    public static int e(int[][] mtrx) {
        int aboveDiagonal = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                if (j > i) aboveDiagonal += mtrx[i][j];
            }
        }
        System.out.println("the main diagonal is: " + d(mtrx));
        return aboveDiagonal;
    }

    public static int f(int[][] mtrx) {
        int underDiagonal = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                if (j < i) underDiagonal += mtrx[i][j];
            }
        }
        System.out.println("the main diagonal is: " + d(mtrx));
        return underDiagonal;
    }

    public static int g(int[][] mtrx) {
        int secondaryDiagonal = 0;
        for (int i = 0; i < mtrx.length; i++) {
            secondaryDiagonal += mtrx[i][mtrx.length - i - 1];
        }
        return secondaryDiagonal;
    }

    public static int h(int[][] mtrx) {
        int underDiagonal = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < i; j++) {
                underDiagonal += mtrx[i][mtrx[i].length - (j + 1)];
            }
        }
        return underDiagonal;
    }

    public static int i(int[][] mtrx) {
        int aboveDiagonal = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length - (i + 1); j++) {
                aboveDiagonal += mtrx[i][j];
            }
        }
        return aboveDiagonal;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        recieveMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        b(matrix);
        System.out.println();
        System.out.println(c(matrix));
        System.out.println();
        System.out.println(d(matrix));
        System.out.println();
        System.out.println(e(matrix));
        System.out.println();
        System.out.println(f(matrix));
        System.out.println();
        System.out.println(g(matrix));
        System.out.println();
        System.out.println(h(matrix));
        System.out.println();
        System.out.println(i(matrix));
    }
}
