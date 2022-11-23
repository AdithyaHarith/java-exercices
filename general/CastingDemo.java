package general;

public class CastingDemo {
    public static void main(String[] args) {
        short s =10; // 12000 // primitive data types
        int i = 10;
        int j = i; // 32000
       // long lg = 100; // 64000
        long lg1 = j;  // implicit type casting
        //System.out.println(lg1);

        long lg2 = 990000000;

        short it = (short) lg2; // type casting // explicit type casting

        float f = 10.5f;
        double d = f; // implicit

        float f1 = (float) d; // explicit

        int k = (int) d; // explicit casting

        double d1 = k; // implicit casting

        System.out.println(k);
    }
}
