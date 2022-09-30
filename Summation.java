import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        int n;
        int sum = 0;

//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();

        sum = summation(10);

        System.out.println(sum);


        sum = summation(20);

        System.out.println(sum);

    }
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

}

