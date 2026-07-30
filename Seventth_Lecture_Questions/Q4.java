import java.util.Scanner;
public class Q4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        char choice;
        
        do {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            
            
            if (num > 0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            } else {
                zeros++;
            }
            
            
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
            System.out.println();
            
        } while (choice == 'y');
        
       
        System.out.println("--- Summary Results ---");
        System.out.println("Positive numbers: " + positives);
        System.out.println("Negative numbers: " + negatives);
        System.out.println("Zeros: " + zeros);
        
        scanner.close();
    }
}

