import java.util.Scanner;

public class Add {

    public static void main(String[] args) { // start

        System.out.println("Enter first number:");
        int number1= new Scanner(System.in).nextInt();

        System.out.println("Enter second number:");
        int number2= new Scanner(System.in).nextInt();

        //int result = add(number1, number2);
  int result = number1+number2;

        System.out.println("Addition result: "+result);

    } // end

    public static int add(int n1, int n2) {
        int sum; // variable declaration
        sum=n1+n2;
        return sum;
  }



}

