package general;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) { // 3 - 10
//        int num=7;
//        boolean isPrime=true;
//        for(int i=2;i<=7;i++){
//            if(num%i==0) {
//                isPrime=false;
//                break;
//            }
//
//        }
//        if(isPrime==true){
//            System.out.println("Prime");
//        } else{
//            System.out.println("Not Prime");
//        }
       int num=7;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean isPrime=true;
        for(int i=2;i<7;i++){
            if(n%i==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }

    }
}

