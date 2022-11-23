package general;

import java.util.Scanner;

public class PrimeOrNotUsingScanner {
    public static void main(String[] args) {
        int c=0;
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
