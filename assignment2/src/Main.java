public class Main {

    public static void main(String[] args) {

        System.out.println("Armstrong Number:");
        System.out.println(getArmstrongNum(200, 1000));


        System.out.println("Palindrome:");
        System.out.println("Racecar is " + isPalindrome("racecar"));
        System.out.println("Pikachu is " + isPalindrome("pikachu"));
        System.out.println("A is " + isPalindrome("a"));

        System.out.println("Fibonnachi:");
        System.out.println(getFibonacci(5));

        System.out.println("Rupees to dollars:");
        System.out.println(convertCurrency(34.34));
//
//        System.out.println("Larger num:");
//        System.out.println(compareNums(500, 5000));
//
//        System.out.println("Basic calculator:");
//        System.out.println(calculate());
//
//        System.out.println("Calculate interest:");
//        System.out.println(calculateInterest(100, 2, 0.22f));
//
//        System.out.println("Print greeting:");
//        printGreeting();
//
//        System.out.println("Is even:");
//        System.out.println(isEven());

    }

    /**
     * Find the first occurrence of an Armstrong number, if one exists,
     * between 2 numbers. If none exists, function will return '-1'.
     */
    private static int getArmstrongNum(int a, int b) {

        for (int i = a; i <= b; i++) {
            if (isArmstrong(i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isArmstrong(int num) {

        int numCopy = num;
        int sum = 0;

        if (num > 10) {
            while (numCopy > 0) {
                int digit = numCopy % 10;
                numCopy = numCopy / 10;
                sum += Math.pow(digit, 3);
            }
        } else {
            sum += Math.pow(numCopy, 3);
        }
        return sum == num;
    }

    /**
     * To find out whether the given String is Palindrome or not.
     */
    private static boolean isPalindrome(String a) {

        int i = 0;
        int j = a.length() - 1;

        String b = a.toLowerCase();

        while (i <= j) {
            if (b.charAt(i) != b.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    /**
     * To calculate Fibonacci Series up to n numbers.
     */
    private static int getFibonacci(int n) {

        int previousFibonacciNum = 0;

        if (n == 0) {
            return previousFibonacciNum;
        }

        int fibonacciNum = 1;

        while (n > 0) {
            fibonacciNum = previousFibonacciNum + fibonacciNum;
            previousFibonacciNum = fibonacciNum - previousFibonacciNum;
            n--;
        }
        return fibonacciNum;
    }

    /**
     * Input currency in rupees and output in USD.
     */
    private static String convertCurrency(double rupees) {
        return (Math.floor(0.012 * rupees * 100) / 100.0) + " Dollars";
    }

    /**
     * Take 2 numbers as input and print the largest number.
     */
    private static double compareNums(int a, int b) {
        return 0;
    }

    /**
     * Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
     */
    private static double calculate() {
        return 0;
    }

    /**
     * Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
     */
    private static double calculateInterest(double principal, int time, float rate) {
        return 0;
    }

    /**
     * Take name as input and print a greeting message for that particular name.
     */
    private static void printGreeting() {
        return;
    }

    /**
     * Write a program to print whether a number is even or odd, also take input from the user.
     */
    private static boolean isEven() {
        return true;
    }
}