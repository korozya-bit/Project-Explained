import java.util.Scanner;

public class bigNum {
    public static int biggestNum(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        if (num2 > num3){
            return num2;
        }
        return num3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int newnum = 0;
        while (num > 0) {
            if (num % 10 % 2 != 0) {
                 newnum = newnum * 10 + num % 10;
            }
            num /= 10;
        }
        System.out.println(newnum);
    }
}
