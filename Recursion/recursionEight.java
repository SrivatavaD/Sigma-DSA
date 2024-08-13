public class recursionEight {
    // You are given a number(eg:- 2019), convert it into string of english like
    // "two zero one nine". Use a recursive function to solve this problem .
    // The digits of the number will be only be in integer range 0-9 and last digit
    // of a number can't be 0.
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int number) {
        if (number == 0) {
            return;

        }

        int lastDigits = number % 10;
        printDigits(number / 10);
        System.out.println(digits[lastDigits] + " ");
    }

    public static void main(String[] args) {
        printDigits(1234);
        System.out.println();
    }
}
