import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("YOUR FIRST NUMBER IS ");
        int a = sc.nextInt();
        System.out.print("YOUR SECOND NUMBER IS ");
        int b = sc.nextInt();
        
        if(a>b){
            System.out.print("First number was bigger "+a);
        }else if(b>a){
            System.out.print("Second number was bigger "+b);
        }else{
            System.out.print("Invalid cant answere");
        }
    }
}
