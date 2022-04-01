import java.util.Random;
import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int i, num = rnd.nextInt(100), guess = 0, numOfGuesses = 0;
        boolean found = false;
        for (i=0; i<=20 && !found; i++){
            System.out.print("Enter your guess: ");
            guess = in.nextInt();
            if (guess == num){
                System.out.println("Correct!");
                found = true;
            }
            else if(guess > num){
                System.out.println("your guess is too big");
            }
            else {
                System.out.println("your guess is too small");
            }
            numOfGuesses++;
        }
        System.out.println("it took you " + numOfGuesses + " guesses");
    }
}
