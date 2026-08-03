public class SetBits {
    public static void main(String[] args) {
        int a=5;
        int b=1;
        int mask=1<<b;

        int c = mask | a;
        System.out.print(c);
    }
}
