import java.util.Random;
import java.util.Scanner;

public class BonusPage {

    // A functions that return weather or not two integers are equal
    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    // A functions that return the smallest integer in an array
    public static int returnSmallest(int num) {
        int reminder, smallest = num % 10;
        while (num > 0) {
            reminder = num % 10;
            if (smallest > reminder) smallest = reminder;
            num = num / 10;
        }
        return smallest;
    }

    // A functions that return the biggest integer in an array
    public static int returnBiggest(int num) {
        int reminder, Largest = 0;
        while (num > 0) {
            reminder = num % 10;
            if (Largest < reminder) {
                Largest = reminder;
            }
            num = num / 10;
        }
        return Largest;
    }

    // A function that returns the square of a number (Question #2)
    public static int square(int num) {
        int sum = 0, oddCounter = 1;
        for (int i = 0; i < Math.abs(num); i++) {
            sum += oddCounter;
            oddCounter += 2;
        }
        return sum;
    }

    // A function that returns weather or not an integer is in an array
    public static boolean integerInArray(int[] array, int num) {
        for (int j : array) {
            if (j == num) return true;
        }
        return false;
    }

    // A function that returns weather or not a digit is in an integer
    public static boolean digitIn(int num, int dig) {
        while (num > 0) {
            if (num % 10 == dig) return true;
            num = num / 10;
        }
        return false;
    }

    // A function that returns weather or not a number is "cool" (Question #3)
    public static boolean cool(int num) {
        return digitIn(num, returnBiggest(num) - returnSmallest(num));
    }

    public static boolean palindrome(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1]) return false;
        }
        return true;
    }

    // A functions that returns the amount of times an integer is in an array
    public static int countNum(int[] arr, int num) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) counter++;
        }
        return counter;
    }

    // A function that returns weather or not an array is "N array" (Question 7)
    public static boolean N(int[] arr, int n) {
        for (int i = 1; i < n + 1; i++) {
            if (countNum(arr, i) != i) return false;
        }
        return true;
    }

    // A function that returns weather or not an array is "organised N array" (Question 8)
    public static boolean greatN(int[] arr, int n) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            for (int j = counter; j < i; j++) {
                if (arr[j] != i) return false;
                counter++;
            }
        }
        return true;
    }

    // Question #9
    public static void goAndTrip() {
        Scanner in = new Scanner(System.in);
        int tourPrice, guidancePrice, guidanceCounter = 0, amountOfPeople = 5;

        System.out.print("How much for the tour? ");
        tourPrice = in.nextInt();

        System.out.print("How much for the guidance? ");
        guidancePrice = in.nextInt();

        for (int i = 0; i <= amountOfPeople; i++) {
            System.out.print("Would you like to get a guide? ");
            char response = in.next().charAt(0);
            if (response == 'y') guidanceCounter++;
            else if (response == 'n') continue;
            else {
                System.out.println("InValid Input, please enter again. ");
                i--;
            }
        }

        System.out.println();
        System.out.println(guidanceCounter + " People are interested in guidance.");
        System.out.println("The company made in total: " + ((tourPrice * amountOfPeople) + (guidancePrice * guidanceCounter)) + '$');
        System.out.println("The guidance added " + (guidancePrice * guidanceCounter) + '$');
    }

    // A function that returns weather or not an array has all numbers from the top number (Question #10)
    public static boolean hasAllNumbers(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            if (!integerInArray(arr, i)) return false;
        }
        return true;
    }

    // A function that returns the biggest divisor of an integer (Question #11)
    public static void biggestDivisor(int num) {
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                System.out.println("The biggest divider is " + i);
                return;
            }
        }
        System.out.println("No divider found");
    }

    // A function that return weather or not one array is equal to the second array in reverse (Question 13)
    public static boolean isArrayReversed(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[arr1.length - i - 1]) return false;
        }
        return true;
    }

    // A function that returns the combined amount of all digits in an integer
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    // A function that returns weather or not two integers are "twins" (Question 14 a)
    public static boolean isTwin(int num1, int num2) {
        return digitSum(num1) == digitSum(num2);
    }

    // A function that returns the amount of "twins in two arrays
    public static int countTwins(int[] arr1, int[] arr2) {
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (isTwin(arr1[i], arr2[j])) counter++;
            }
        }
        return counter;
    }

    // main function
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);


        // 1)
//        int cube1, cube2;
//        int doubleCounter = 0;
//        cube1 = (int) (Math.random() * 6);
//        cube2 = (int) (Math.random() * 6);
//
//        while (cube1 != 1 && cube2 != 6 || cube1 != 6 && cube2 != 1){
//            if (isEqual(cube1, cube2)) doubleCounter++;
//            cube1 = (int) (Math.random() * 6);
//            cube2 = (int) (Math.random() * 6);
//            System.out.print(cube1 + " ");
//            System.out.println(cube2);
//        }
//
//        System.out.println(doubleCounter);

//         2 a)
//        System.out.println(square(-4));
//        System.out.println(square(8));

        //2 b)
//        int num, sum = 0;
//        while (sum < 700){
//            num = rnd.nextInt(100) - 50;
//            sum += square(num);
//            System.out.println(square(num));
//        }
//        System.out.println(sum);

        // 3)
//        int num;
//        int[] arr = new int[100];
//        for (int i = 0; i < arr.length; i++) {arr[i] = 0;}
//        int counter = 0;
//        num = in.nextInt();
//        while (num != -1) {
//            if (cool(num)) {
//                arr[counter] = num;
//                counter++;
//            }
//            num = in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) System.out.println(arr[i]);
//        }

//         4)
//        int[] array = new int[]{1, 2, 3, 4, 5};
//        System.out.println(integerInArray(array, 3));
//        System.out.println(integerInArray(array, 6));

//        5)
//        int[] array1 =  new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
//        int[] array2 =  new int[]{1, 2, 3, 5, 3, 2, 4, 1};
//        System.out.println(palindrome(array1));
//        System.out.println(palindrome(array2));
//
//        7)
//        int[] arr = new int[]{1, 2, -1, 2, 3, 3, 5, -3, 4, 4, 3, 4, 4, 5, 5};
//        System.out.println(N(arr, 4));
//        System.out.println(N(arr, 5));

//        8)
        int[] arr = new int[]{1, 2, 2, 3, 3, 3};
        System.out.println(greatN(arr, 3));

//        9)
//        goAndTrip();
//
//        10)
//        int[] arr1 = new int[]{1, 3, 4, 5, 7};
//        int[] arr2 = new int[]{1, 4};
//        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10};
//        System.out.println(hasAllNumbers(arr1));
//        System.out.println(hasAllNumbers(arr2));
//        System.out.println(hasAllNumbers(arr3));
//        System.out.println(hasAllNumbers(arr4));

//        11)
//        biggestDivisor(16);
//        biggestDivisor(93);
//        biggestDivisor(7);

//        13)
//        int[] arr1 = new int[]{1, 2, 3, 4, 5};
//        int[] arr2 = new int[]{5, 4, 3, 2, 1};
//        int[] arr3 = new int[]{2, 1, 3, 5, 4};
//        System.out.println(isArrayReversed(arr1, arr2));
//        System.out.println(isArrayReversed(arr2, arr3));

//        14 a)
//        System.out.println(isTwin(21234, 750));
//        System.out.println(isTwin(134, 75));

//        14 b)
//        int[] array1 = new int[]{750, 5681, 9091, 300, 6482};
//        int[] array2 = new int[]{21234, 468741, 14509, 3, 67846482};
//        System.out.println(countTwins(array1, array2));
    }
}


