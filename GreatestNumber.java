import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        //take two int values from users
        int a=10;
        int b=20;

        System.out.println("Enter first number:");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Enter second number:");
        int number1 = new Scanner(System.in).nextInt();

        if(a>b){

            System.out.println(a);
        }
        else{

           System.out.println(b);
        }


    }
}
