package general;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {


        int length;
        int breadth;

        // take the input of length and breath values from the user..
        //check it is square or not

        Scanner scanner = new Scanner(System.in);
       // System.out.println("enter your first value");

        length= scanner.nextInt();
       // System.out.println("enter your second value");
        breadth = scanner.nextInt();


        if (length == breadth) {

            System.out.println("It is a square");
        } else {
            System.out.println("It is not a square");
        }

        //public static int add(int l,int b){
            if(length==breadth){

            }

        }

    }
//}
