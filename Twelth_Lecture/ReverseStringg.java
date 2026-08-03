
import java.util.Scanner;

public class ReverseStringg {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String name = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(name);

        for(int i =sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }

    }
}
