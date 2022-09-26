import java.util.Scanner;

//2*1=2
//2*2=4

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        System.out.println("Display multiplication Table:");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        for (int i=1; i<=10; i++)
            System.out.println(num+"*"+i+"="+num*i);

        }
    }
}
