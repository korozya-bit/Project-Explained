package BagrutPractice;

import java.util.Random;
import java.util.Scanner;

public class Bagrut_2006 {

	public static int integerBiggest(int num) {
		int biggest = 0;
		while (num > 0) {
			if (num % 10 > biggest) biggest = num % 10;
			num = num / 10;
		}
		return biggest;
	}

	public static int integerSmallest(int num) {
		int smallest = 9;
		while (num > 0) {
			if (num % 10 < smallest) smallest = num % 10;
			num = num / 10;
		}
		return smallest;
	}

	public static int bigSums(int a) {
		int biggest = integerBiggest(a);
		int smallest = integerSmallest(a);

		int sum = 0;

		for (int i = smallest; i <= biggest; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);

		// Q3
//		int[] arr = new int[62];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = rnd.nextInt(1000);
//		}
//
//		int sum = 0;
//		int biggerThen248 = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > 100) sum += arr[i];
//			if (arr[i] > 248) biggerThen248 ++;
//		}
//
//		System.out.println("sum: " + sum);
//		System.out.println("bigger then 248: " + biggerThen248);


		//Q6
//		int lottery = 0;
//		int show = 0;
//		int cafeteria = 0;
//
//		int temp;
//		int freeCounter = 0;
//		int counter = 0;
//
//		while (true){
//			System.out.println("How many lottery tickets did you get?");
//			temp = in.nextInt();
//
//			if (temp == -1) break;
//
//			System.out.println("How many show tickets did you get?");
//			show += in.nextInt();
//			System.out.println("How many cafeteria tickets did you get? ");
//			cafeteria += in.nextInt();
//
//			if (temp > 10) freeCounter++;
//			lottery += temp;
//
//			counter++;
//		}
//
//		System.out.println("There were " + counter + " People in the event");
//		System.out.println("The lottery sold " + lottery + " Tickets" );
//		System.out.println("The show sold " + show + " Tickets" );
//		System.out.println("The cafeteria sold " + cafeteria + " Tickets" );
//
//		System.out.println(freeCounter + "Tickets were given for free");


		// Q7 a
//		System.out.println(bigSums(52));
//
//		// b
//		int[] arr = new int[23];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = rnd.nextInt(90) + 10;
//		}
//
//		int counter = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (bigSums(arr[i]) > 15) counter++;
//		}
//		System.out.println(counter);

		// Q10
//
//		int sum = 0; // an integer var to sum the total price of all the books
//		int studentSum = 0; // an integer var to sum the total price for each student
//		int code; // an integer var to get the code of the book from the user
//		int[] codes = new int[315]; // an array to count how much of each code was bought
//		int amount; // an integer var to get the amount of books the student gets (of the same book)
//		int price = 28; // an integer var to set the default price of a single book
//		int amountOfStudents = 3; // an integer var to set the amount of students in school ** SHOULD BE SET TO 620 **
//
//		for (int i = 0; i < amountOfStudents; i++) {
//			while (true) {
//				System.out.println("what's the code for your book? ");
//				code = in.nextInt();
//
//				if (code == 0) break;
//
//				System.out.println("how many copies of it are you getting? ");
//				amount = in.nextInt();
//
//				codes[code] += amount;
//				studentSum += amount * price;
//			}
//			sum += studentSum;
//			System.out.println("You need ot pay " + studentSum + "$");
//			System.out.println("Next student.");
//			studentSum = 0;
//		}
//
//		System.out.println("The total sum of all books: " + sum + "$");
//		for (int i = 0; i < codes.length; i++) {
//			if (codes[i] != 0) System.out.println("the code " + i + " was bought " + codes[i] + " times");
//		}
	}
}
