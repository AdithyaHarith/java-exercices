import java.util.Scanner;

public class Add {

    public static void main(String[] args) {

        int a;
        int b;
        int sum;

        System.out.println("Enter the first number:");
        Scanner number1 = new Scanner(System.in);
        a = number1.nextInt();

        System.out.println("Enter the second number:");
        Scanner number2 = new Scanner(System.in);
        b = number2.nextInt();

        sum = a + b;

        System.out.println("Addition:" +sum);


    }
}// start

       /* System.out.println("Enter first number:");
        int number1 = new Scanner(System.in).nextInt();

        System.out.println("Enter second number:");
        int number2 = new Scanner(System.in).nextInt();

        int result = add(number1, number2);

        System.out.println("Addition result: " + result);

    } // end

    public static int add(int a, int b) {  // scope of variables

        int c = a + b;
        return c;
    }

}*/

