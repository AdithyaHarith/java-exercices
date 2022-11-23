package general.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a=5;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();

        for (int i = 1; i <=5; i++) {

            count = count * i;

        }
        System.out.println(count);
    }
}
