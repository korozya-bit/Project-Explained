package matrix;

import java.util.Scanner;

public class Q1 {
    public static int[][] recieveMatrix(int[][] mtrx) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                mtrx[i][j] = in.nextInt();
            }
        }
        return mtrx;
    }

    public static void printMatrix(int[][] mtrx) {
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                System.out.print("|");
                System.out.print(mtrx[i][j]);
            }
            System.out.println("|");
        }
    }

    public static int[][] resetMatrix(int[][] mtrx) {
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                mtrx[i][j] = 0;
            }
        }
        return mtrx;
    }

    public static int[][] countCells(int[][] mtrx) {
        int counter = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                mtrx[i][j] = counter;
                counter++;
            }
        }
        return mtrx;
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

    public static int getBiggestValue(int[][] mtrx) {
        int biggest = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                if (mtrx[i][j] > biggest) biggest = mtrx[i][j];
            }
        }
        return biggest;
    }

    public static String getBiggestIndex(int[][] mtrx) {
        int biggestValue = getBiggestValue(mtrx);
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                if (mtrx[i][j] == biggestValue) return "The biggest Num is in: Row: " + i + "  Column: " + j;
            }
        }
        return "None Found";
    }

    public static int countAppearences(int[][] mtrx, int num){
        int counter = 0;
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                if (mtrx[i][j] == num) counter ++;
            }
        }
        return counter;
    }

    public static boolean contains(int[][] mtrx, int num){
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                if (mtrx[i][j] == num) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mtrx = new int[4][3];
        mtrx = resetMatrix(mtrx);
        printMatrix(mtrx);
        //
        mtrx = recieveMatrix(mtrx);
        printMatrix(mtrx);
        //
        System.out.println();
        mtrx = countCells(mtrx);
        printMatrix(mtrx);
        //
        System.out.println();
        System.out.println(sumCells(mtrx));
        System.out.println();
        //
        mtrx[3][2] = 84;
        System.out.println(getBiggestValue(mtrx));
        System.out.println(getBiggestIndex(mtrx));
        //
        mtrx [0][2] = 4;
        System.out.println(countAppearences(mtrx, 4));
        //
        System.out.println(contains(mtrx, 12));
        System.out.println(contains(mtrx, 11));
        }
}