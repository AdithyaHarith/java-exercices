package general;

public class palindrome {

    public static void main(String[] args) {
        String[] word=new String[5];
        word[0]="pop";
        word[1]="deed";
        word[2]="kayak";
        word[3]="kayal";
        word[4]="madam";

        System.out.println("display general.palindrome:");

        for(int i=0; i<=4; i++){

            StringBuilder builder = new StringBuilder(word[i]);

            String reversedWord = builder.reverse().toString();

            if(word[i].equals(reversedWord))
            {
                System.out.println(word[i]);
            }
        }


    }
}
