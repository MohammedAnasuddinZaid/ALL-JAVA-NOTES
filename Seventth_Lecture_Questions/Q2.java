// import java.util.Scanner;

// public class Q2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         System.out.print(a*a);



//     }
// }

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= a; i += 2) {
            sum += i;
        }

        System.out.print(sum);
    }
}
