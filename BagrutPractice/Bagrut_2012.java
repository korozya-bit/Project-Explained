package BagrutPractice;

import java.util.Scanner;

public class Bagrut_2012 {

	public static int[] matnas(int amountOfPeople) {
		Scanner in = new Scanner(System.in);

		int user;
		int[] arr = new int[3];

		for (int i = 0; i < amountOfPeople; i++) {
			System.out.println("What activity would you like to sign in to? ");
			System.out.println("1 - painting) \n2 - theater) \n3 - singing)");
			user = in.nextInt();
			switch (user) {
				case 1 -> arr[0] += 1;
				case 2 -> arr[1] += 1;
				case 3 -> arr[2] += 1;
			}
		}
		return arr;
	}

	public static int returnActivity(int[] arr, int activity) {
		return arr[activity];
	}

	public static void getRooms(int[] arr) {
		int counter;
		for (int i = 0; i < 3; i++) {
			counter = 0;
			while (arr[i] > 0) {
				arr[i] -= 40;
				counter++;
			}
			System.out.println("acitivity number " + i + " needs " + counter + " rooms");
		}
	}

	public static void addToArray(String[] arr, String str) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = str;
				break;
			}
		}
	}

	public static boolean teen(int age) {
		return age < 19 && age > 15;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Q10
//		int[] arr = matnas(10);
//		System.out.println();
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
//		getRooms(arr);

		//Q8
//		int healthySnacksCounter = 0;
//
//		String name;
//		int oil, calories, counter = 0;
//
//		String[] healthySnacks = new String[100];
//		while (healthySnacksCounter < 2) {
//			System.out.println("Whats the name of the snack? ");
//			name = in.next();
//			System.out.println("How many calories does it have? ");
//			calories = in.nextInt();
//			System.out.println("how much oil is there in it");
//			oil = in.nextInt();
//
//			if (calories < 130 && oil < 5) {
//				healthySnacksCounter++;
//				addToArray(healthySnacks, name);
//			}
//			counter ++;
//		}
//
//		for (int i = 0; i < healthySnacks.length; i++) {
//			if (healthySnacks[i] != null) System.out.println(healthySnacks[i] + " is healthy");
//		}
//		System.out.println("In total " + counter + " snacks were checked");
//	}

		// Q7 a
//		System.out.println(teen(11));
//		System.out.println(teen(17));
//		System.out.println(teen(20));

		// b
//		int age, listenHours, counter = 0;
//
//		//                  v should be 492
//		for (int i = 0; i < 3; i++) {
//			System.out.println("How old are you? ");
//			age = in.nextInt();
//			System.out.println("For how long were you listening");
//			listenHours = in.nextInt();
//
//			if (teen(age) && listenHours > 3) counter++;
//		}
//
//		System.out.println("There are " + counter + " teens that have listened for more then 3 hours");


//		System.out.println(targil2(5));
	}

	public static char targil2(int num) {
		char ab = 'b';
		if (num > 3) {
			ab = 'a';
		}
		return ab;
	}

	public static int targil4(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 450 && arr[i] >= 100) {
				sum += arr[i];
			}
		}
		return sum;
	}
}