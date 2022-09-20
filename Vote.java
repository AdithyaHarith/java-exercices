public class Vote {
    public static void main(String[] args) {
        int[] bag = new int[10]; // declare int array variable of size 10
        int count = 0;

        bag[0] = 17;
        bag[1] = 18;
        bag[2] = 40;
        bag[3] = 10;
        bag[4] = 15;
        bag[5] = 19;
        bag[6] = 30;
        bag[7] = 24;
        bag[8] = 58;
        bag[9] = 23;

        for (int i = 0; i < 10; i++) {
            if (bag[i] > 18) {
                count = count + 1;
            }

        }
       /* if (bag[0] > 18) {
            count = count + 1;
        }

        if (bag[1] > 18) {
            count = count + 1;
        }

        if (bag[2] > 18) {
            count = count + 1;
        }

        if (bag[3] > 18) {
            count = count + 1;
        }

        if (bag[4] > 18) {
            count = count + 1;
        }

        if (bag[5] > 18) {
            count = count + 1;
        }

        if (bag[6] > 18) {
            count = count + 1;
        }

        if (bag[7] > 18) {
            count = count + 1;
        }

        if (bag[8] > 18) {
            count = count + 1;
        }

        if (bag[9] > 18) {
            count = count + 1;
        }*/

        System.out.println(count);

    }

}