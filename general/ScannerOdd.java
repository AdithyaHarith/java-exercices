package general;

import java.util.Scanner;

public class ScannerOdd {
    public static void main(String[] args) {
        int a;
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= 10; i++) {
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if (a % 2 == 0) {
                even = even + 1; // counter variable
            } else {
                odd = odd + 1; // counter variable
            }
        }
        System.out.println("even numbers: "+ even);
        System.out.println("odd numbers :" + odd);
    }
}
