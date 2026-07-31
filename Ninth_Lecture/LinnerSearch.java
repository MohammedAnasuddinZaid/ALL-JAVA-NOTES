
import java.util.Scanner;

public class LinnerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many to print list ");
        int n = sc.nextInt();

        int inpu[] = new int[n];
        
        for(int i =0;i<inpu.length;i++){       
            System.out.print("YOUR "+i+" Number: ");
            inpu[i] = sc.nextInt();
        }
        System.out.print("YOUR Targeting Number: ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(inpu[i]==x){
                System.out.print("YOUR Targeted numbers index is "+i);
                return;
                
            }
        }

    }


}
