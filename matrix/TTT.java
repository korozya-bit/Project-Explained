package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class TTT {
	public static void printMatrix(char[][] matrix) {
		for (char[] chars : matrix) {
			for (char aChar : chars) {
				System.out.print("|");
				System.out.print(aChar);
			}
			System.out.println("|");
		}
	}

	public static void printIntMatrix(int[][] matrix) {
		for (int[] ints : matrix) {
			for (int anInt : ints) {
				System.out.print("|");
				System.out.print(anInt);
			}
			System.out.println("|");
		}
	}

	public static void resetMatrix(char[][] matrix) {
		for (char[] chars : matrix) {
			Arrays.fill(chars, ' ');
		}
	}

	public static void countCells(int[][] matrix) {
		int counter = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = counter;
				counter++;
			}
		}
	}

	public static boolean isWon(char[][] board, char whosTurn) {
		return rowChecker(board, 0, whosTurn) || rowChecker(board, 1, whosTurn) || rowChecker(board, 2, whosTurn) ||
				columnChecker(board, 0, whosTurn) || columnChecker(board, 1, whosTurn) || columnChecker(board, 2, whosTurn) ||
				diagonalChecker(board, whosTurn) || secondaryDiagonalChecker(board, whosTurn);
	}

	public static char whosTurn(int counter) {
		if (counter % 2 == 0) return 'X';
		return 'O';
	}

	public static int rowTranslate(int num) {
		int counter = 0;
		while (num > 0) {
			num -= 3;
			counter++;
		}
		return counter;
	}

	public static int columnTranslate(int num) {
		return num - ((rowTranslate(num) - 1) * 3) - 1;
	}

	public static void boardChanger(int num, char[][] matrix, int counter) {
		matrix[rowTranslate(num) - 1][columnTranslate(num)] = whosTurn(counter);
	}

	public static boolean isAvailable(char[][] matrix, int num) {
		return matrix[rowTranslate(num) - 1][columnTranslate(num)] == ' ';
	}

	public static boolean rowChecker(char[][] board, int row, char whosTurn) {
		return board[row][0] == whosTurn && board[row][1] == whosTurn && board[row][2] == whosTurn;
	}

	public static boolean columnChecker(char[][] board, int column, char whosTurn) {
		return board[0][column] == whosTurn && board[1][column] == whosTurn && board[2][column] == whosTurn;
	}

	public static boolean diagonalChecker(char[][] board, char whosTurn) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] != whosTurn) return false;
		}
		return true;
	}

	public static boolean isTie(char[][] board) {
		for (char[] chars : board) {
			for (char aChar : chars) {
				if (aChar == ' ') return false;
			}
		}
		return true;
	}

	public static boolean secondaryDiagonalChecker(char[][] board, char whosTurn) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][board.length - i - 1] != whosTurn) return false;
		}
		return true;
	}

	public static int getSafeInput(boolean isRecursive) {
		Scanner in = new Scanner(System.in);

		if (isRecursive) System.out.println("InValid Input, Please enter another.");

		String input = in.nextLine();
		char finalInput;

		if (input.length() != 1) return getSafeInput(true);
		finalInput = input.charAt(0);
		if ((int) (finalInput) > 48 && (int) (finalInput) < 58) return finalInput - 48;
		return getSafeInput(true);
	}

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		resetMatrix(board);

		int[][] example = new int[3][3];
		countCells(example);
		printIntMatrix(example);
		System.out.println();

		int counter = 0;
		int choice;

		System.out.println("Welcome to TicTacToe \nLets Begin! \n");
		while (!isWon(board, whosTurn(counter - 1))) {
			System.out.println("Its " + whosTurn(counter) + "'s turn!");
			System.out.println("Enter your next move! ");
			choice = getSafeInput(false);
			while (!isAvailable(board, choice)) {
				System.out.println("This spot is already caught, Please enter another");
				choice = getSafeInput(false);
			}
			boardChanger(choice, board, counter);
			System.out.println();
			printMatrix(board);

			counter++;

			if (isTie(board)) break;
		}

		if (isWon(board, whosTurn(counter - 1))) System.out.println(whosTurn(counter - 1) + " Won!");
		else {
			System.out.println("Its a Tie!");
		}
	}
}
