package matrix;

import java.util.Scanner;

public class Q4 {
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

	// lockers functions
	public static int getRow(int[][] matrix, int num){
		int counter = 0;
		while (num > 0){
			num -= matrix.length;
			counter++;
		}
		return counter -1;
	}

	public static int getColumn(int[][] matrix, int num){
		return num % matrix.length;
	}

	public static int getCode(int[][] matrix, int num){
		return matrix[getRow(matrix, num)][getColumn(matrix, num)];
	}

	// Boy scouts functions
	public static int biggestInARow(int[][] matrix, int row){
		int biggest = 0;
		for (int i = 0; i < matrix[row].length; i++) {
			if (matrix[row][i] > biggest) biggest = matrix[row][i];
		}
		return biggest;
	}

	public static void printLowestMax(int[][] matrix, int minmax){
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				if (matrix[i][j] == minmax) System.out.println("Team: " + (int)(j+1) + " Gdud: " + (int)(i+1));
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Q 11 - Lockers

		int[][] lockers = new int[9][9];
		recieveMatrix(lockers);
		printMatrix(lockers);

		System.out.print("Whats the id for the locker? ");
		System.out.println("The code for this locker is: " + getCode(lockers, in.nextInt()));

		// Q13 Boy Scouts

		int[][] scouts = new int[4][6];
		int minMax;
		recieveMatrix(scouts);
		minMax = Math.min(Math.min(biggestInARow(scouts, 0), biggestInARow(scouts, 1)), Math.min(biggestInARow(scouts, 2), biggestInARow(scouts, 3)));
		printLowestMax(scouts, minMax);
	}
}
