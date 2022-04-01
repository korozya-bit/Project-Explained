import java.util.Scanner;

public class PalindromeTester {

    public static String reverseString(String string) {
        String reversedString = "";
        for (int i = 0; i < string.length(); i++){
            reversedString += string.charAt(string.length() - i - 1);
        }
        return reversedString;
    }

    public static boolean isPalindrome(String str){ return str.equals(reverseString(str));}

        public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter a String and I'll tell you if its a Palindrome: ");
        String sen = in.nextLine();
        if (isPalindrome(sen)){
            System.out.println("Its a Palindrome!");
        }
        else {
            System.out.println("Its not a Palindrome...");
        }
    }
}
