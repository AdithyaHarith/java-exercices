public class OddOrEvenNumbersArrays {
    public static void main(String[] args) {
        int[] bag = new int[10];

        bag[0] = 4;
        bag[1] = 5;
        bag[2] = 6;
        bag[3] = 33;
        bag[4] = 40;
        bag[5] = 34;
        bag[6] = 8;
        bag[7] = 89;
        bag[8] = 56;
        bag[9] = 76;

        System.out.println("Odd numbers are:");
        for (int i = 0; i <= 9; i++) {
            if (bag[i] % 2 == 1) {
                System.out.println(bag[i]);
            }
        }
        System.out.println("Even numbers are:");
        for(int i=0; i<=9; i++){
            if(bag[i]%2==0){
                System.out.println(bag[i]);
            }
        }
    }
}



