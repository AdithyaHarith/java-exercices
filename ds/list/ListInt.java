package ds.list;


public class ListInt {

    private int[] bero;

    public ListInt(int capacity) {
        bero = new int[capacity];
    }

    public void add(int value, int shelf) { //
         bero[shelf] = value; // bero kulla entha shelf la entha values ah vechitu
    }
    public int get(int shelf){//
         return bero[shelf]; //  bero kulla erukura shelf la erukura values ha enkita tharu
    }

}
