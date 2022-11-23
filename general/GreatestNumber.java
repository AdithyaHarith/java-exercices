package general;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        int a;
        int b;
        System.out.println("Enter the first number:");
        Scanner n1 = new Scanner(System.in);
        a = n1.nextInt();

        System.out.println("Enter the second number:");
        Scanner n2 = new Scanner(System.in);
        b = n2.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}

//
//        int a = 10;
//        int b = 20;
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//    }
//
//}

//}

//    public static void main(String[] args) {
//
//        //take two int values from users
//
//        System.out.println("Enter first number:");
//        int number1 = new Scanner(System.in).nextInt();
//
//        System.out.println("Enter second number:");
//        int number2 = new Scanner(System.in).nextInt();
//
//        int max = big(number1, number2);
//
//        System.out.println(max);
//
//    }
//    public static int big(int s, int r) {
//        if (s > r) {
//            return s;
//        } else {
//            return r;
//        }
//    }
//}
//


