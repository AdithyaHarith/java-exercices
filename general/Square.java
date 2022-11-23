package general;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {


        int length;
        int breadth;

        // take the input of length and breath values from the user..
        //check it is square or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first value");
        length = scanner.nextInt();
        System.out.println("enter your second value");
        breadth = scanner.nextInt();
        if (length == breadth) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is not a square");
        }
    }
}

//        int length=2;
//        int breath=3;
//        if(length==breath){
//            System.out.println("square:");
//        }else {
//            System.out.println("Not square:");
//