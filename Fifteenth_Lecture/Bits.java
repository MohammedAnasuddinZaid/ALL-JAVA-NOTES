public class Bits {
    public static void main(String[] args) {
        
   
        int n=5;
        int pos=2;
        int BITMASK = 1<<pos;

        if((BITMASK & n) == 0){
            System.err.println("was 0");
        }else{
            System.err.println("was 1");
        }
    }
}
