import java.util.Random;

public class sortingAlgorithem {

	public static void sortArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < i) swapNumbersInArray(arr, arr[j], arr[i]);
			}
		}
	}

	public static void swapNumbersInArray(int[] arr, int index1, int index2){
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static boolean isArraySorted(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i) return false;
		}
		return true;
	}

	public static void arrayMixer(int[] arr){
		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			swapNumbersInArray(arr, rnd.nextInt(arr.length), rnd.nextInt(arr.length));
		}
	}

	public static void printArray(int[] arr){
		for (int j : arr) {
			System.out.print(j + "|");
		}
		System.out.println();
	}

	public static void compareArrays(int[] sorted, int[] compared){
		for (int i = 0; i < sorted.length; i++) {
			if (sorted[i] != compared[i]) System.out.println(sorted[i] + " " + compared[i]);
		}
	}

	public static void setupArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	public static void main(String[] args) {
		int amount = 1000;
		int[] mixed = new int[amount];
		int[] sorted = new int[amount];

		setupArray(mixed);
		setupArray(sorted);

		arrayMixer(mixed);


			sortArray(mixed);
			printArray(mixed);

		compareArrays(mixed, sorted);
		System.out.println();
		printArray(mixed);
		printArray(sorted);
		System.out.println();
		System.out.println(isArraySorted(mixed));
	}
}
