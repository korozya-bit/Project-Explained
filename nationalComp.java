import java.util.Scanner;

public class nationalComp {
    public static double avg(int[] a) {
        // A functions that calculates the avg value from an Array of numbers
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void arrayCleaner(String[] arr) {
        // A functions that get wipes all values from a given Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
    }

    public static void main(String[] args) {
        // Defying amount of students And Scanner
        int amountOfStudents = 5;
        Scanner in = new Scanner(System.in);

        // Defying all the needed Arrays
        String[] highestScores = new String[10];
        int[] grades = new int[amountOfStudents];
        String[] names = new String[amountOfStudents];
        String[] FavoriteLanguage = new String[amountOfStudents];

        // Getting Input for all students
        for (int i = 0; i < amountOfStudents; i++) {
            System.out.println("whats your name?");
            names[i] = in.nextLine();
            System.out.println("whats your score?");
            grades[i] = Integer.parseInt(in.nextLine());
            System.out.println("fav lang?");
            FavoriteLanguage[i] = in.nextLine();
        }
        // Calculating and printing the average score
        double avg = avg(grades);
        System.out.println("The avg is: " + avg);

        // Defying variables
        int javaCounter = 0;
        int highestscorestracker = 0;
        int highestScore = 0;
        int acceptedStudents = 0;

        // A for loop that runs on all students who got in the competition
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > avg) {
                // all the students that were accepted are in this loop, and are usable by making use of the variable i
                // Printing all the students who got in
                System.out.println(names[i] + " is in!");
                acceptedStudents ++;
                // counting all students that prefer java
                if (FavoriteLanguage[i].equals("java")) javaCounter++;
                // Checking for the students with the highest scores
                if (grades[i] > highestScore) {
                    highestScore = grades[i];
                    arrayCleaner(highestScores);
                    highestscorestracker = 0;
                    highestScores[0] = names[i];
                } else if (grades[i] == highestScore) {
                    highestscorestracker++;
                    highestScores[highestscorestracker] = names[i];
                }
            }
        }
        // Printing the results
        System.out.println(acceptedStudents + " Students got in!");
        System.out.println(javaCounter + " of which consider java as their favourite programming language");
        System.out.println("The highest score is: " + highestScore);
        for (int i = 0; i < highestScores.length; i++) {
            if (!highestScores[i].equals("")) {
                System.out.println(highestScores[i] + " got the highest score!");
            }
        }
    }
}
