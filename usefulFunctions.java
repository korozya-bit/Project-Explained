public class usefulFunctions {
	public static int intBiggest(int num) {
		int biggest = 0;
		while (num > 0) {
			if (num % 10 > biggest) biggest = num % 10;
			num = num / 10;
		}
		return biggest;
	}

	public static int arrayBiggest(int[] arr) {
		int biggest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > biggest) biggest = arr[i];
		}
		return biggest;
	}

	public static int digitSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}

	public static boolean isIntInArray(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) return true;
		}
		return false;
	}

	public static int indexOfInt(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) return i;
		}
		return -1;
	}

	public static boolean isDigitInInt(int num, int dig) {
		while (num > 0) {
			if (num % 10 == dig) return true;
			num = num / 10;
		}
		return false;
	}

	public static boolean palindrom(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - i - 1]) return false;
		}
		return true;
	}

	public static boolean hasAllNumbers(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			if (!isIntInArray(arr, i)) return false;
		}
		return true;
	}

	public static void addToArray(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = num;
				return;
			}
		}
	}
}
