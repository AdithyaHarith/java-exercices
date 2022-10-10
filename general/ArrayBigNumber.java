package general;

public class ArrayBigNumber {
    public static void main(String[] args) {
       int[] bag = new int[10];
       int hand1, hand2 = 0;
       int bigTable = 0;

       bag[0] = 56;
       bag[1] = 22;
       bag[2] = 63;
       bag[3] = 200;
       bag[4] = 43;
       bag[5] = 500;
       bag[6] = 23;
       bag[7] = 54;
       bag[8] = 73;
       bag[9] = 89;

       hand1 = bag[0];
       hand2 = bag[1];

       if (hand1 > hand2) {
          bigTable = hand1;
       }

       for(int i=2; i<=9; i++ ){
          hand1=bag[i];
          if(hand1>bigTable)
             bigTable=hand1;
       }

       /*hand1=bag[2];
       if(hand1>bigTable)
          bigTable=hand1;

       hand1=bag[3];
       if(hand1>bigTable)
          bigTable=hand1;

       hand1=bag[4];
       if(hand1>bigTable)
          bigTable=hand1;

       hand1=bag[5];
       if(hand1>bigTable)
          bigTable=hand1;

       hand1=bag[6];
       if(hand1>bigTable)
          bigTable=hand1;

       hand1=bag[7];
       if(hand1>bigTable)
          bigTable=hand1;

       hand1=bag[8];
       if(hand1>bigTable)
          bigTable=hand1;

       hand1=bag[9];
       if(hand1>bigTable)
          bigTable=hand1;*/

       System.out.println("big number is"+ bigTable);
    }
}
