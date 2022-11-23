package general;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
//
//        int n;
//        System.out.println("Enter the Numbers:");
//        Scanner scan=new Scanner(System.in);
//        n=scan.nextInt();
//
//        for(int i=1;i<=n;i++){
//            System.out.println(i+"");
//        }
//
        int n;
        System.out.println("Enter the numbers:");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i+"");
        }
    }
}
