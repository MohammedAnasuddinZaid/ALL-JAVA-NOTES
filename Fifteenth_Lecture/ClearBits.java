public class ClearBits {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int mask=1<<b;
        

        int c = ~mask & a;
        System.out.print(c);
    }
}
