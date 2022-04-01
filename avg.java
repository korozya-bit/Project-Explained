import java.util.Scanner;

public class avg {

    public static double avg(int num)
    {
        // ממוצע ספרות
        double mem; //ממצוע
        int sum,  //סכום הספרות
                count; //כמות הספרת
        sum=0;
        count=0;
        while (num>0)
        {
            sum+=num%10;
            count++;
            num/=10;
        }
        mem =(double)sum/(double)count;
        return mem;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, biggest = 1; // במספר הגדול ביותר, משתנה משהמשתש
        for (int i = 0; i < 30; i++){
            num = in.nextInt();
            if (avg(num) > (double)avg(biggest)){
                biggest = num;
            }
        }
        System.out.println(biggest);

    }
}