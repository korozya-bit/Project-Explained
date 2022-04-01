public class numricPalindrom {
    public static int reverseNum(int num) {
        int reversedNum = 0;
        int runAmount = len(num);
        for (int i = 0; i < runAmount; i++) {
            reversedNum *= 10;
            reversedNum += num % 10;
            num = num / 10;
        }
        return reversedNum;
    }

    public static int len(int num) {
        int counter = 0;
        while (num > 0) {
            counter++;
            num = num / 10;
        }
        return counter;
    }

    public static boolean isPalindrom(int num){return num == reverseNum(num);}

    public static void main(String[] args) {
        System.out.println(isPalindrom(456));
        System.out.println(isPalindrom(454));
    }
}
