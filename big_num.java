import java.util.Scanner;

public class big_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number");
        int num = in.nextInt();
        int biggest = 0, digit;
        while (num > 0){
            digit = num % 10;
            if (digit > biggest){
                biggest = digit;
            }
            num /= 10;
        }
        System.out.println(biggest);
    }
}
