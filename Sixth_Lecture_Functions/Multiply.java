import java.util.Scanner;

public class Multiply {
    
    public static void Multi(int a,int b){
        System.out.print("Mult of 2 numbers are "+a*b);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        Multi(a, b);
    }
}
