import java.util.Random;

public class diceRoll {
    public static int RandomRange(int from, int to){
        Random rnd = new Random();

        int temp = to - from;

        int num = rnd.nextInt(temp+1) + from;
       return (num);
    }

    public static void main(String [] args) {
        int num1, num2, amountOfEqual;

        num1 = RandomRange(1, 6);
        num2 = RandomRange(1, 6);

        amountOfEqual = 0;

        while ((num1 != 1 || num2 != 6)){
            System.out.println(num1 + " " + num2);
            num1 = RandomRange(1, 6);
            num2 = RandomRange(1, 6);
            if (num1 == num2){
                amountOfEqual ++;
            }
        }
        System.out.println(amountOfEqual);
    }
}