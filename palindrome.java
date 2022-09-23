public class palindrome {

    public static void main(String[] args) {
        String[] bag=new String[5];
        bag[0]="pop";
        bag[1]="deed";
        bag[2]="kayak";
        bag[3]="kayal";
        bag[4]="madam";

        System.out.println("display palindrome:");

        for(int i=0; i<=4; i++){

            StringBuilder builder = new StringBuilder(bag[i]);

            String reversedWord = builder.reverse().toString();

            if(bag[i].equals(reversedWord))
            {
                System.out.println(bag[i]);
            }
        }


    }
}
