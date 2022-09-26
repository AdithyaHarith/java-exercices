import java.util.Scanner;

public class Length {
    public static void main(String[] args) {


        int a;
        int b;



        // take the input of length and breath values from the user..
        //check it is square or not

        Scanner number = new Scanner(System.in);
       // System.out.println("enter your first value");
        a = number.nextInt();
       // System.out.println("enter your second value");
        b = number.nextInt();


        if (a == b) {

            System.out.println("It is a square");
        } else {
            System.out.println("It is not a square");
        }

    }
}
