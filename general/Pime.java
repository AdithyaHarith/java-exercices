package general;

public class Pime {
    public static void main(String[] args) {
        int num=19;
        boolean isPrime=true;
        for(int i=2;i<19;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not");
        }
    }
}









