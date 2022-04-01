import java.util.Scanner;

public class manager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours = 1, payment = 0, sum = 0, count = 0, salary = 0;
        while (true){
            System.out.println("how many hours did you work this month? ");
            hours = in.nextInt();
            if (hours == -1){
                break;
            }
            System.out.println("how much do you get per hour? ");
            payment = in.nextInt();
            sum = sum + hours * payment;
            salary = salary + payment;
            count++;
            if (hours > 150){
                System.out.println("added 100");
                sum = sum + 100;
            }
        }
        System.out.println("money spend on workers is: " + sum);
        System.out.println("the avg salary is: " + salary / count);
    }
}
