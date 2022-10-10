package general;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        System.out.println("enter first number:");
        int number = new Scanner(System.in).nextInt();

        System.out.println("enter second number:");
        int number1 = new Scanner(System.in).nextInt();

        System.out.println("what operation:");
        String operation = new Scanner(System.in).nextLine();

        if(operation.equals("+")) {
            int sum = addition(number, number1);
            System.out.println("result:" + sum);
        }
        if(operation.equals("-")) {
            int sum = subbraction(number, number1);
            System.out.println("result:" + sum);
        }
        if(operation.equals("*")) {
            int sum = multiplication(number, number1);
            System.out.println("result:" + sum);
        }
        if(operation.equals("/")) {
            int sum = division(number, number1);
            System.out.println("result:" + sum);
        }

    }

    public static int addition(int a, int b) {
        int c = a + b;
        return c;

    }

    public static int subbraction(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    public static int division(int a, int b) {
        int c = a / b;
        return c;
    }
}