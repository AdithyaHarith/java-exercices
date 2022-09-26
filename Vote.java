public class Vote {
    public static void main(String[] args) {
        int[] age = new int[10]; // declare int array variable of size 10
        int count = 0;

        age[0] = 17;
        age[1] = 18;
        age[2] = 40;
        age[3] = 10;
        age[4] = 15;
        age[5] = 19;
        age[6] = 30;
        age[7] = 24;
        age[8] = 58;
        age[9] = 23;

        for (int i = 0; i < 10; i++) {
            if (age[i] > 18) {
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