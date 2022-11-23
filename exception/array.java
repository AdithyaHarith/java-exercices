package exception;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int[] num = {2, 4, 6, 4, 7, 3, 8, 10, 4, 20};

        for(int i=1;i<=5;i++) {

            System.out.println("Enter the index:");
            Scanner number2 = new Scanner(System.in);
            int idx = number2.nextInt();

            try {
                System.out.println("array value is " + num[idx]);
            }
            catch (Exception ex) {
                System.out.println("exception occured, index bigger");
            }
        }

    }
}
