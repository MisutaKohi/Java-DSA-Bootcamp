import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Armstrong Number:");
//        System.out.println(getArmstrongNum(200, 1000));
//
//        System.out.println("Palindrome:");
//        System.out.println("Racecar is " + isPalindrome("racecar"));
//        System.out.println("Pikachu is " + isPalindrome("pikachu"));
//        System.out.println("A is " + isPalindrome("a"));
//
//        System.out.println("Fibonnachi:");
//        System.out.println(getFibonacci(5));
//
//        System.out.println("Rupees to dollars:");
//        System.out.println(convertCurrency(34.34));
//
//        System.out.println("Larger num:");
//        System.out.println(compareNums(500, 500));

//        System.out.println("Basic calculator:");
//        System.out.println(calculate());
//
//        System.out.println("Calculate interest:");
//        System.out.println(calculateInterest(100, 2, 0.22f));
//
        System.out.println("Print greeting:");
        printGreeting();
//
//        System.out.println("Is even:");
//        System.out.println(isEven(-32));

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
    private static String compareNums(int a, int b) {
        if (a > b) {
            return a + "";
        } else if (b > a) {
            return b + "";
        } else {
            return "equal";
        }
    }

    /**
     * Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
     */
    private static double calculate() {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a num: ");
        double a = input.nextDouble();

        System.out.print("Please enter another num: ");
        double b = input.nextDouble();

        System.out.print("What do you want to do: +, -, /, or *?: ");
        String c = input.next();

        String availableSymbols = "+-/*";

        while (c.length() != 1 || availableSymbols.contains(c) != true) {
            System.out.print("\nPlease try again. What do you want to do: +, -, /, or *?: ");
            c = input.next();
        }

        if (c.compareTo("+") == 0) {
            return a + b;
        } else if (c.compareTo("-") == 0) {
            return a - b;
        } else if (c.compareTo("/") == 0) {
            return a / b;
        } else {
            return a * b;
        }
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
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.next();

        System.out.println("Hello, " + name + "!");
    }

    /**
     * Write a program to print whether a number is even or odd, also take input from the user.
     */
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}