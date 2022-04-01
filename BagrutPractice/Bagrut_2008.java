package BagrutPractice;

import java.util.Scanner;

public class Bagrut_2008 {

	public static boolean sum200(int num1, int num2) {
		return num1 + num2 == 200;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Q1
//		int num1, num2, num3;
//
//		System.out.print("what's the first number? ");
//		num1 = in.nextInt();
//		System.out.print("what's the second number? ");
//		num2 = in.nextInt();
//		System.out.print("what's the second number? ");
//		num3 = in.nextInt();
//
//		if (num1 + num2 == 200 || sum200(num2, num3) || sum200(num1, num3)) System.out.println("yes");
//		else System.out.println("no");

		// Q3
//		int[] arr = new int[51];
//		Random rnd = new Random();
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = rnd.nextInt(2) * 6 + 1;
//		}
//
//		int oneCounter = 0, sevenCounter = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 1) oneCounter++;
//			else sevenCounter++;
//		}
//
//		if (Math.max(oneCounter, sevenCounter) == oneCounter) System.out.println('1');
//		else System.out.println('7');

		// Q5

//		int a, b;
//		//                  v should be 38
//		for (int i = 0; i < 3; i++) {
//			System.out.print("what's the first number? ");
//			a = in.nextInt();
//			System.out.print("what's the second number? ");
//			b = in.nextInt();
//
//			System.out.println("The sum is: " + (a + b));
//
//			if (b != 0){
//				System.out.println("the division is: " + a/b);
//			}
//			else System.out.println("indivisible");
//		}
	}
}
