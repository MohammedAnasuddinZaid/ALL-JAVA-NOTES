
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int numbers[][]=  new int[a][b];


        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
            
                numbers[i][j]= sc.nextInt();
            
            }
        }

        
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
            
                System.out.print(numbers[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
