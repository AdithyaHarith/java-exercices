package exception;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {

        for (int i=1; i<=5;i++) {

            System.out.println("Enter the first number:");
            Scanner number1 = new Scanner(System.in);
            int a = number1.nextInt();

            System.out.println("Enter the second number:");
            Scanner number2 = new Scanner(System.in);
            int b = number2.nextInt();

            try {
                int c = a / b;
                System.out.println("result:"+c);
            }
            catch (Exception ex) {
                System.out.println("exception occured, division failed");
            }
        }
    }
}
