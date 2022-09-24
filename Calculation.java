import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        System.out.println("enter first number:");
        int number = new Scanner(System.in).nextInt();

        System.out.println("enter second number:");
        int number1 = new Scanner(System.in).nextInt();


        //int result=add(number, number1);
        System.out.println("what operation:");
        String operation = new Scanner(System.in).nextLine();


        // If i give + symbol then it should add the given input number and it will display the result

        if (operation.equals("+")) {
            int sum = number + number1;
            System.out.println("result:" + sum);

        }

        // if i give - symbol then it should sub the given input number and it will display the result
        if (operation.equals("-")) {
            int sum = number - number1;
            System.out.println("result:" + sum);
        }

        // if i give * symbol then it should multiply the given input number and it will display the result
        if (operation.equals("*")) {
            int sum = number * number1;
            System.out.println("result:" + sum);
        }


        // if i give / symbol then it should divide the given input number and it will display the result

        if (operation.equals("/")) {
            int sum = number / number1;
            System.out.println("result:" + sum);
        }
    }

}
