package general;

import java.util.Scanner;

public class ScannerOddOrEven {
    public static void main(String[] args) {
//      int big=0;
////        int b;
//
//        for(int i=0;i<=10;i++){
//            Scanner scanner=new Scanner(System.in);
//           big= scanner.nextInt();
//            if(i>big){
//              i=big;//   big=big+1;
//            }
//        }
//        System.out.println(big);

//        if(a>b){
//            System.out.println(a);
//        }
//        else{
//            System.out.println(b);
//        }

        int a;
        //   int number = 0;
        int even = 0;
        int odd=0;
        System.out.println("Enter the number:");
        for (int i = 1; i <= 10; i++) {
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if (a % 2 == 0) {
                even = even + 1;
            }
            else {
                odd = odd+1;
            }
        }
        System.out.println("The Total Even Number is:");
        System.out.println(even);
        System.out.println("The Total Odd Number is:");
        System.out.println(odd);
    }
}
