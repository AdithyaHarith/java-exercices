package general;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {

        int a;
        int total=0;


        for(int i=1;i<=10;i++){
            Scanner scanner=new Scanner(System.in);
            a=scanner.nextInt();
            total=total+a;
        }
        System.out.println(total);
//        int n;
//        int a = 0;
//
//      Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//
//        a = summation(10);
//
//        System.out.println(a);
//
//
//        a = summation(20);
//
//        System.out.println(a);
//
//    }
//    public static int summation(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        return sum;
    }

}

