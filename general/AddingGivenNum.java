package general;


import java.util.Scanner;

public class AddingGivenNum {
    public static void main(String[] args) {
        int a = 0;
//        int b;
        int sum = 0;
        System.out.println("Enter the Number:");
        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            sum = sum + a;
        }
        System.out.println(sum);
    }
}




